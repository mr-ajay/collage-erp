import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class project extends JFrame implements ActionListener {
    project(){
        setSize(1400,750);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("clgimg/Main 1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1400,650,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,0,200,200);
        add(image);

        JMenuBar mb = new JMenuBar();

        //<<<<......New information....>>>>>>

        JMenu newinformation = new JMenu("Home");
        newinformation.setBackground(Color.green);
        newinformation.setForeground(Color.BLACK);
        mb.add(newinformation);

        //New Faculty infomation
        JMenuItem Facultyinfo =  new JMenuItem(" Faculty Information");
        Facultyinfo.setBackground(Color.BLUE);
        Facultyinfo.setForeground(Color.WHITE);
        Facultyinfo.addActionListener(this);
        newinformation.add(Facultyinfo);


        //student information.
        JMenuItem studentinfo =  new JMenuItem("Student Information");
        studentinfo.setBackground(Color.BLUE);
        studentinfo.setForeground(Color.WHITE);
        studentinfo.addActionListener(this);
        newinformation.add(studentinfo);

        //Attendence
        JMenuItem atten = new JMenuItem(" Students Attendance");
        atten.setBackground(Color.BLUE);
        atten.setForeground(Color.WHITE);
        newinformation.add(atten);





        //<<<<.... Detail ....>>>>>

        JMenu details = new JMenu("View Details");
        details.setBackground(Color.BLUE);
        details.setForeground(Color.BLACK);
        mb.add(details);

        //New Faculty infomation
        JMenuItem Facultydetails =  new JMenuItem("View Faculty Details");
        Facultydetails.setBackground(Color.BLUE);
        Facultydetails.setForeground(Color.WHITE);
        Facultydetails.addActionListener(this);
        details.add(Facultydetails);


        //student information...
        JMenuItem Studentdetails =  new JMenuItem("View Student Details");
        Studentdetails.setBackground(Color.BLUE);
        Studentdetails.setForeground(Color.WHITE);
        Studentdetails.addActionListener(this);
        details.add(Studentdetails);


        //View  today student present
        JMenuItem atten1 = new JMenuItem("View Present Students ");
        atten1.setBackground(Color.BLUE);
        atten1.setForeground(Color.WHITE);
        details.add(atten1);



        //<<<<.... Leave ....>>>>>

        JMenu leave = new JMenu("Apply Leave");
        leave.setBackground(Color.BLUE);
        leave.setForeground(Color.BLACK);
        leave.addActionListener(this);
        mb.add(leave);

        //New Faculty infomation
        JMenuItem FacultyLeave =  new JMenuItem("Faculty Leave ");
        FacultyLeave.setBackground(Color.BLUE);
        FacultyLeave.setForeground(Color.WHITE);
        FacultyLeave.addActionListener(this);
        leave.add(FacultyLeave);


        //student information...
        JMenuItem Studentleave =  new JMenuItem("Student Leave");
        Studentleave.setBackground(Color.BLUE);
        Studentleave.setForeground(Color.WHITE);
        leave.add(Studentleave);

//        //<<<<.... Leave Details ....>>>>>
//
//        JMenu leaveDetails = new JMenu("Leave Details");
//        leaveDetails.setBackground(Color.BLUE);
//        leaveDetails.setForeground(Color.BLACK);
//        mb.add(leaveDetails);
//
//        //New Faculty infomation
//        JMenuItem facultyleaveDatails =  new JMenuItem("Faculty Leave Details ");
//        facultyleaveDatails.setBackground(Color.BLUE);
//        facultyleaveDatails.setForeground(Color.WHITE);
//        leaveDetails.add(facultyleaveDatails);
//
//
//        //student information...
//        JMenuItem StudentleaveDetails =  new JMenuItem("Student Leave Details");
//        StudentleaveDetails.setBackground(Color.BLUE);
//        StudentleaveDetails.setForeground(Color.WHITE);
//        leaveDetails.add(StudentleaveDetails);



        //<<<<.... INTERNAL EXAMINATION ....>>>>>

        JMenu exams = new JMenu("Examination");
        exams.setBackground(Color.BLUE);
        exams.setForeground(Color.BLACK);
        mb.add(exams);

        //New Faculty infomation
        JMenuItem examinationdetails =  new JMenuItem("Examination Results ");
        examinationdetails.setBackground(Color.BLUE);
        examinationdetails.setForeground(Color.WHITE);
        examinationdetails.addActionListener(this);
        exams.add(examinationdetails);

        //student information...
        JMenuItem entermarks =  new JMenuItem("Enter marks");
        entermarks.setBackground(Color.BLUE);
        entermarks.setForeground(Color.WHITE);
        entermarks.addActionListener(this);
        exams.add(entermarks);

        //<<<-------Fees Structure----->>>>
        JMenu fees = new JMenu("Fees Details");
        fees.setBackground(Color.BLUE);
        fees.setForeground(Color.BLACK);
        mb.add(fees);

        //New Faculty infomation
        JMenuItem FeeStructure =  new JMenuItem("Fees Structure ");
        FeeStructure.setBackground(Color.BLUE);
        FeeStructure.setForeground(Color.WHITE);
        FeeStructure.addActionListener(this);
        fees.add(FeeStructure);

        //student information...
        JMenuItem FeeForm =  new JMenuItem("Student Fee Form");
        FeeForm.setBackground(Color.BLUE);
        FeeForm.setForeground(Color.WHITE);
        FeeForm.addActionListener(this);
        fees.add(FeeForm);

        //About....>>>
        JMenu about  = new JMenu("About");
        about.setBackground(Color.BLUE);
        about.setForeground(Color.BLACK);
        mb.add(about);


        JMenuItem ab =  new JMenuItem("About");
        ab.setBackground(Color.BLUE);
        ab.setForeground(Color.WHITE);
        ab.addActionListener(this);
        about.add(ab);

        setJMenuBar(mb);
        setVisible(true);

        //<<---Exit-->>>
        JMenu exit = new JMenu("Exit");
        exit.setBackground(Color.BLUE);
        exit.setForeground(Color.BLACK);

        mb.add(exit);


        JMenuItem ex =  new JMenuItem("Exit");
        ex.setBackground(Color.BLUE);
        ex.setForeground(Color.WHITE);
        ex.addActionListener(this);
        exit.add(ex);

        setJMenuBar(mb);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = e.getActionCommand();
        if(msg.equals("Exit")){
            setVisible(false);
        } else if (msg.equals(" Faculty Information")) {
            new AddTeacher();

        } else if (msg.equals("Student Information")) {
            new AddStudent();

        } else if (msg.equals("Faculty Leave ")) {
            new TeacherLeave();

        } else if (msg.equals("Student Leave")) {
            new StudentLeave();

        } else if ((msg.equals("Enter marks"))) {
            new EnterMarks();

        }else if(msg.equals("Examination Results ")){
            new ExaminationDetails();
        }else if(msg.equals("Student Fee Form")){
            new StudentFeeForm();
        }else if (msg.equals("Fees Structure ")){
            new FeeStructure();
        }else if (msg.equals("About")){
            new About();
        } else if (msg.equals("View Faculty Details")) {
            new TeacherDetails();

        } else if (msg.equals("View Student Details")) {
            new StudentDetails();
        }
    }

    public static void main(String[] args) {
        new project();

    }
}
