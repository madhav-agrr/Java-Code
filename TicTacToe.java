import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe extends JApplet {
    private char[][] board;
    private char currentPlayer;
    private boolean gameEnded;
    private JLabel messageLabel;
    private JButton[] buttons;

    public void init() {
        board = new char[3][3];
        currentPlayer = 'X';
        gameEnded = false;

        setLayout(new BorderLayout());

        JPanel gamePanel = new JPanel();
        gamePanel.setLayout(new GridLayout(3, 3));

        buttons = new JButton[9];
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            buttons[i].setFont(new Font("Arial", Font.PLAIN, 50));
            buttons[i].addActionListener(new ButtonListener(i));
            gamePanel.add(buttons[i]);
        }

        messageLabel = new JLabel("Player " + currentPlayer + "'s turn");

        add(gamePanel, BorderLayout.CENTER);
        add(messageLabel, BorderLayout.SOUTH);

        initializeBoard();
    }

    public void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        updateButtons();
    }

    public void updateButtons() {
        for (int i = 0; i < 9; i++) {
            int row = i / 3;
            int col = i % 3;
            buttons[i].setEnabled(!gameEnded && board[row][col] == '-');
            buttons[i].setText(Character.toString(board[row][col]));
        }
    }

    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isWinner(char player) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }

        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }

    public void changePlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }

    public void playComputerMove() {
        if (gameEnded || currentPlayer == 'X') {
            return;
        }

        int row, col;

        do {
            row = (int) (Math.random()*3);
            col = (int) (Math.random()*9);
        } while (board[row][col] != '-');

        board[row][col] = currentPlayer;
        updateButtons();
        changePlayer();

        if (isWinner('O')) {
            messageLabel.setText("Computer wins!");
            gameEnded = true;
        } else if (isBoardFull()) {
            messageLabel.setText("It's a draw!");
            gameEnded = true;
        } else {
            messageLabel.setText("Player " + currentPlayer + "'s turn");
        }
    }

    private class ButtonListener implements ActionListener {
        private int buttonIndex;

        public ButtonListener(int buttonIndex) {
            this.buttonIndex = buttonIndex;
        }

        public void actionPerformed(ActionEvent e) {
            if (gameEnded || currentPlayer == 'O') {
                return;
            }

            int row = buttonIndex / 3;
            int col = buttonIndex % 3;

            if (board[row][col] == '-') {
                board[row][col] = currentPlayer;
                buttons[buttonIndex].setText(Character.toString(currentPlayer));

                if (isWinner('X')) {
                    messageLabel.setText("Player X wins!");
                    gameEnded = true;
                } else if (isBoardFull()) {
                    messageLabel.setText("It's a draw!");
                    gameEnded = true;
                } else {
                    changePlayer();
                    messageLabel.setText("Player " + currentPlayer + "'s turn");
                    playComputerMove();
                }
            }
        }
    }
}


/*<html>
<head><title>Hello</title></head>
<applet code="TicTacToe.class" height="1000" width="1000">
</applet>
</html>*/
