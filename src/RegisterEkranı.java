import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RegisterEkranı extends JFrame{
    private JPanel panel2;
    private JPanel RegisterPanel;
    private JTextField Kullanıcıadialani;
    private JPasswordField parolaAlani;
    private JButton registerButton;

    public RegisterEkranı(){

        add(panel2);
        setSize(800, 600);
        setTitle("İlk Swing Form");
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String kullanıcı_adı = Kullanıcıadialani.getText();
                String parola = new String(parolaAlani.getPassword());

                ArrayList<User> user_list = AnaEkran.getUser_list();

                user_list.add(new User(kullanıcı_adı,parola));

                setVisible(false);

            }
        });
    }
}
