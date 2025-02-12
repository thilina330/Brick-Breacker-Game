import javax.swing.JFrame;

public class BrickBreacker {

    public static void main(String[] args) {
        
        JFrame obj = new JFrame();
        GamePlay gamePlay = new GamePlay();

        obj.setBounds(10,10,700,600);
        obj.setResizable(false);
        obj.setTitle("Brick Breacker Game");
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
    }
}