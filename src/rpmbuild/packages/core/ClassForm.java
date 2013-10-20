package rpmbuild.packages.core;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ClassForm extends JFrame {

    private JFrame MainFormView = new JFrame("RPM");
    
    private JLabel Label1 = new JLabel("my label");
    
    private JTextField textfield_Package_Name = new ClassTextFieldHint("Package name");  
    private JTextField textfield_Package_Version = new ClassTextFieldHint("Package version");
    private JTextField textfield_Release_Number = new ClassTextFieldHint("Release number");
    private JTextField textfield_Summary_Info = new ClassTextFieldHint("Summary info");
    private JTextField textfield_Group_App = new ClassTextFieldHint("Group App");
    private JTextField textfield_License_Name = new ClassTextFieldHint("License name");
    private JTextField textfield_URL_address = new ClassTextFieldHint("URL address");
    
    private JTextField textfield_Requires_RPM = new ClassTextFieldHint("Requires RPM");
    
    private JTextField textfield_Build_Dir = new ClassTextFieldHint("Build directory");
    private JTextField textfield_BuildRoot_Dir = new ClassTextFieldHint("Buildroot directory");
    private JTextField textfield_Prefix_Dir = new ClassTextFieldHint("Prefix directory");
    
    
    public ClassForm() { 
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 800); 
        setVisible(true);
        setResizable(false);
        setLayout(null);
        setFocusable(true);
        setLocationRelativeTo(null);   
        add(textfield_Package_Name);
        add(textfield_Package_Version);
        add(textfield_Release_Number);
        add(textfield_Summary_Info);
        add(textfield_Group_App);
        add(textfield_License_Name);
        add(textfield_URL_address);
        add(textfield_Requires_RPM);
        add(textfield_Build_Dir);
        add(textfield_BuildRoot_Dir);
        add(textfield_Prefix_Dir);
        add(Label1);
        
        textfieldCreate();
        repaint();
        
    }
    
    private void textfieldCreate()  {
        textfield_Package_Name.setHorizontalAlignment(JTextField.LEFT);
        textfield_Package_Name.setBounds(5, 10, 180, 20);
        textfield_Package_Name.setVisible(true);
        textfield_Package_Name.setToolTipText("Package name");
        textfield_Package_Name.setText("");
        
        textfield_Package_Version.setHorizontalAlignment(JTextField.LEFT);
        textfield_Package_Version.setBounds(188, 10, 180, 20);
        textfield_Package_Version.setVisible(true);
        textfield_Package_Version.setToolTipText("Package version");
        textfield_Package_Version.setText("");
        
        textfield_Release_Number.setHorizontalAlignment(JTextField.LEFT);
        textfield_Release_Number.setBounds(5, 34, 180, 20);
        textfield_Release_Number.setVisible(true);
        textfield_Release_Number.setToolTipText("Release number");
        textfield_Release_Number.setText("");
        
        textfield_Summary_Info.setHorizontalAlignment(JTextField.LEFT);
        textfield_Summary_Info.setBounds(188, 34, 180, 20);
        textfield_Summary_Info.setVisible(true);
        textfield_Summary_Info.setToolTipText("Summary info");
        textfield_Summary_Info.setText("");
        
        textfield_Group_App.setHorizontalAlignment(JTextField.LEFT);
        textfield_Group_App.setBounds(5, 58, 180, 20);
        textfield_Group_App.setVisible(true);
        textfield_Group_App.setToolTipText("Group app");
        textfield_Group_App.setText("");
        
        textfield_License_Name.setHorizontalAlignment(JTextField.LEFT);
        textfield_License_Name.setBounds(188, 58, 180, 20);
        textfield_License_Name.setVisible(true);
        textfield_License_Name.setToolTipText("License name");
        textfield_License_Name.setText("");
        
        Label1.setBounds(188, 80, 180, 20);
        Label1.setVisible(true);
        Label1.setText("Label111");
    }
}
