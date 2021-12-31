import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


class User{
    private String kullanıcı_adı;
    private String parola;

    public User(String kullanıcı_adı, String parola) {
        this.kullanıcı_adı = kullanıcı_adı;
        this.parola = parola;
    }

    public String getKullanıcı_adı() {
        return kullanıcı_adı;
    }

    public void setKullanıcı_adı(String kullanıcı_adı) {
        this.kullanıcı_adı = kullanıcı_adı;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }
}



public class AnaEkran extends JFrame{
    private static ArrayList<User> user_list = new ArrayList<User>();

    public static ArrayList<User> getUser_list() {
        return user_list;
    }

    public static void setUser_list(ArrayList<User> user_list) {
        AnaEkran.user_list = user_list;
    }



    private JPanel LoginPanel;
    private JPanel registerloginpanel;
    private JButton registerButton;
    private JButton loginButton;
    private JTextField kullaniciadialani;
    private JPasswordField paraloadi;
    private JPanel panel1;

    public AnaEkran() {

        add(panel1);
        setSize(800, 600);
        setTitle("İlk Swing Form");

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                RegisterEkranı registerEkranı = new RegisterEkranı();

                registerEkranı.setVisible(true);
            }
        });
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String kullanıcı_adı = kullaniciadialani.getText();
                String Parola =new String(paraloadi.getPassword());

                if(user_list.size() == 0 ){
                    JOptionPane.showMessageDialog(null,"Hiçbir kullanıcı bulunmamaktadır");
                }
                else{

                    for(User user : user_list){
                        if(user.getKullanıcı_adı().equals(kullanıcı_adı) && user.getParola().equals(Parola)){
                            JOptionPane.showMessageDialog(null,"Hoşgeldiniz " + kullanıcı_adı);
                            return;
                        }

                        else{
                            JOptionPane.showMessageDialog(null,"Böyle bir kullanıcı bulunammaktadır");

                        }
                    }

                }
            }
        });
    }
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                AnaEkran AE = new AnaEkran();
                AE.setVisible(true);
            }
        });
}

}


