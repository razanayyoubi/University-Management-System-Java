
package Admin;

//import Admin.Course;
import Admin.Course;
import Admin.CourseSection;
import Admin.Instructor;
import Admin.NormalCourseSection;
import Admin.OnlineCourseSection;
import Admin.Student;
import java.awt.*;
import static java.awt.BorderLayout.CENTER;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class AdminDashboard2 extends JFrame {

    private static ArrayList<Student> allStudents = new ArrayList<>();
    private static ArrayList<Course> allCourses = new ArrayList<>();
    private static ArrayList<Instructor> allInstructors = new ArrayList<>();

    public static ArrayList<Instructor> getAllInstructors() {
        return allInstructors;
    }

    // --- JPanel declarations ---
    private JPanel mainCenterPanel;
    private CardLayout cardLayout;
    JPanel statsWrapper;
    JPanel courseStatusPanel;
    JPanel studentDetailsSouth;
    JPanel addStudentDetails;
    JPanel addCourseCenter;
    JPanel addCourseDetails;
    JPanel courseNamePanel;
    JPanel Students;
    JPanel addCancelNotesPanel;
    JPanel addCancelCourse;
    JPanel addStudentPanel;
    JPanel adminLeftSide;
    JPanel header;
    JPanel statistics;
    JPanel nbStudents;
    JPanel nbCourses;
    JPanel nbInstructors;
    JPanel center;
    JPanel Courses;
    JPanel Instructors;
    JPanel viewInstructorNamePanel;
    JPanel enterIDToRemove;
    JPanel viewStudentDetails;
    JPanel viewName;
    JPanel viewPanelButtons;
    JPanel viewStudentEnterID;
    JPanel courseCodePanel;
    JPanel viewSSN;
    JPanel viewPhoneNB;
    JPanel viewAddress;
    JPanel removeStudentBtnPanel;
    JPanel viewStudentPanel;
    JPanel removeCoursePanel;
    JPanel courseDetailsToRemove;
    JPanel removeStudentPanel;
    JPanel removeStudentPanelCenter;
    JPanel addCoursesPanel;
    JPanel courseMaxNbStudentsPanel;
    JPanel Actions;
    JPanel viewCoursePanel;
    JPanel viewCourseCodePanel;
    JPanel courseDetailsPanel;
    JPanel viewNamePanel;
    JPanel viewMaxStudentsPanel;
    JPanel viewTypePanel;
    JPanel viewCourseButtonsPanel;

// --- JLabel declarations ---
    JLabel moveStudentNotes;
    JLabel nameText;
    JLabel id;
    JLabel fillGradesNotesLabel;
    JLabel viewCourseHeader;
    JLabel viewCourseCodeLabel;
    JLabel courseNameLabel;
    JLabel maxStudentsLabel;
    JLabel typeLabel;
    JLabel viewCourseNotes;
    JLabel removeStudentHeader;
    JLabel courseCodeLabel;
    JLabel viewStudentNotes;
    JLabel addCourseHeader;
    JLabel addStudentNote;
    JLabel courseName;
    JLabel courseCode;
    JLabel removeStudentSentence;
    JLabel removeCourseHeader;
    JLabel courseNotes;
    JLabel viewPanelEnterID;
    JLabel ssnText;
    JLabel phoneNBText;
    JLabel addressText;
    JLabel removedNotes;
    JLabel viewStudentHeaderSentence;
    JLabel courseMaxNbStudents;
    JLabel statusLabel;
    JLabel adminLabelHeader;
    JLabel notesLabel;
    JLabel name;
    JLabel ssn;
    JLabel courseInstructorNameLabel;

    JLabel phoneNB;
    JLabel address;
    JLabel addStudentHeader;
    JLabel FillGradesNotes;
    JLabel studentNameToFillGrade;
    JLabel removeNotesLabel;
    JLabel removeCourseNotes;
    JLabel addInstructorNote;
    JLabel removeInstructorNotes;
    JLabel viewInstructorNotes;

// --- JTextField declarations ---
    JTextField enterNbWeeks;
    JTextField enterCourseInstructor;
    JTextField courseCodeFieldAddStudent;
    JTextField idToAddForCourse;
    JTextField viewInstructorNameField;
    JTextField viewInstructorSSNResult;
    JTextField viewInstructorPhoneResult;
    JTextField viewInstructorAddressResult;
    JTextField viewInstructorAgeResult;
    JTextField viewInstructorDeptResult;
    JTextField viewInstructorMajorResult;
    JTextField nameInstructorResult;
    JTextField SsnInstructorResult;
    JTextField InstructorPhoneNBResult;
    JTextField InstructorAddressResult;
    JTextField removeStudentIdField;
    JTextField removeCourseCodeField;
    JTextField enterFinalCourse;
    JTextField enterStudentIDToRemove;
    JTextField enterInitialCourse;
    JTextField viewNameField;
    JTextField studentInstructorIdField;
    JTextField enterInstructoName;
    JTextField enterInstructorSSN;
    JTextField enterInstructorNameToRemove;
    JTextField enterInstructorPhoneNB;
    JTextField enterInstructorAddress;
    JTextField viewCourseCodeField;
    JTextField courseNameField;
    JTextField maxStudentsField;
    JTextField typeField;
    JTextField enterCourseName;
    JTextField enterCourseCode;
    JTextField enterCourseToRemove;
    JTextField idToRemove;
    JTextField enterAge;
    JTextField viewID;
    JTextField nameResult;
    JTextField ssnResult;
    JTextField phoneNBResult;
    JTextField addressResult;
    JTextField enterMaxNbStudents;
    JTextField enterName;
    JTextField enterSSN;
    JTextField enterPhoneNB;
    JTextField enterAddress;
    JTextField enterInstructorMajor;
    JTextField enterInstructorDepartment;
    JTextField enterInstructorAge;
    JTextField enterCourseCodeToFill;
    JTextField fillingGradeOfStudentText;
    JTextField courseInstructorNameField;

// --- JButton declarations ---
    JButton searchInstructor;
    JButton editInstructor;
    JButton saveInstructor;
    JButton addStudentCourseButton;
    JButton removeCourseBtn;
    JButton searchStudent;
    JButton editStudent;
    JButton saveStudent;
    JButton addCourseBtn;
    JButton removeStudentBtn;
    JButton cancelCourseBtn;
    JButton searchCourseBtn;
    JButton editCourseBtn;
    JButton saveCourseBtn;
    JButton addStudentToCourse;
    JButton removeStudentFromCourse;
    JButton moveStudentFromCourseToAnother;
    JButton fillGrades;
    JButton addStudentBtn;
    JButton addStudent;
    JButton removeStudent;
    JButton viewStudent;
    JButton addCourse;
    JButton removeCourse;
    JButton viewCourse;
    JButton addInstructor;
    JButton removeInstructor;
    JButton viewInstructor;
    JButton addInstructorBtn;
    JButton FillGradesBtn;
    JButton NextButton;
    JButton FillThisStudentButton;
    JButton PreviousButton;

// --- JRadioButton declarations ---
    JRadioButton online;
    JRadioButton normal;

// --- Font declarations ---
    Font LabelFont;
    Font textFieldFont;
    Font buttonFont;

    public AdminDashboard2() {

        allCourses = FileHandler.loadCourses("courses.dat");
        allStudents = FileHandler.loadStudents("students.dat");
        allInstructors = FileHandler.loadInstructors("instructors.dat");

        // Find the highest existing ID
        int maxID = 0;
        System.out.println("All Studentds:");
        for (Student s : allStudents) {
            if (s.getID() > maxID) {
                maxID = s.getID();
            }
            System.out.println(s.toString());
        }
        System.out.println("");
        System.out.println("All Instructors");
        for (Instructor a : allInstructors) {
            System.out.println(a.toString());
        }
        //  Set the next available ID for new students
        Student.setIDCounter(maxID + 1);
        System.out.println("Next available student ID: " + Student.getIDCounter());

        setTitle("Admin Dashboard");
        setLayout(new BorderLayout());

        // ---------------------   Declaring all elements  ---------------------   
        ImageIcon logoPic;
        Image scaledImage;
        ImageIcon resizedIcon;
        JLabel logoLabel;

        //  ---------------------------  Designing  ----------------------------
        // Center Panel
        //center = new JPanel();
        center = new JPanel(new CardLayout());
        add(center, BorderLayout.CENTER);

        // First Panel (North)
        header = new JPanel();
        header.setLayout(new BorderLayout());
        adminLabelHeader = new JLabel("                Admin Dashboard");
        adminLabelHeader.setHorizontalAlignment(JLabel.CENTER);
        adminLabelHeader.setFont(new Font("Segoe UI", Font.BOLD, 18));
        header.add(adminLabelHeader, BorderLayout.CENTER);
        add(header, BorderLayout.NORTH); // Don't forget to add the header
        header.setBackground(new Color(0, 131, 112));
        header.setPreferredSize(new Dimension(0, 55));
        adminLabelHeader.setFont(new Font("Segoe UI", Font.BOLD, 22));
        adminLabelHeader.setForeground(Color.WHITE);

        // Clickabel header to return to homepage
        header.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        header.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CardLayout cl = (CardLayout) center.getLayout();
                cl.show(center, "mainDashboard");
            }
        });

        // Second Panel (West)
        adminLeftSide = new JPanel();
        adminLeftSide.setLayout(new GridLayout(4, 1));

        // -- Student Panel
        Students = new JPanel(new GridLayout(3, 1));
        TitledBorder title = BorderFactory.createTitledBorder("Students");
        title.setTitleColor(Color.WHITE); // Set the title color to white
        Students.setBorder(title);
        addStudent = new JButton("Add Student");
        removeStudent = new JButton("Remove Student");
        viewStudent = new JButton("View Student");
        Students.add(addStudent);
        Students.add(removeStudent);
        Students.add(viewStudent);
        
        adminLeftSide.add(Students);
        Students.setBackground(new Color(0, 131, 112));
        addStudent.setBackground(new Color(237, 237, 237));
        removeStudent.setBackground(new Color(237, 237, 237));
        viewStudent.setBackground(new Color(237, 237, 237));

        // -- Courses Panel
        Courses = new JPanel(new GridLayout(3, 1));
        TitledBorder courseTitle = BorderFactory.createTitledBorder("Courses");
        courseTitle.setTitleColor(Color.WHITE); // Set title color to white
        Courses.setBorder(courseTitle);

        addCourse = new JButton("Add Course");
        removeCourse = new JButton("Remove Course");
        viewCourse = new JButton("View Course");
        Courses.add(addCourse);
        Courses.add(removeCourse);
        Courses.add(viewCourse);
        adminLeftSide.add(Courses);
        Courses.setBackground(new Color(0, 131, 112));

        addCourse.setBackground(new Color(237, 237, 237));
        removeCourse.setBackground(new Color(237, 237, 237));
        viewCourse.setBackground(new Color(237, 237, 237));

        // -- Instructors Panel
        Instructors = new JPanel(new GridLayout(3, 1));
        TitledBorder instructorTitle = BorderFactory.createTitledBorder("Instructors");
        instructorTitle.setTitleColor(Color.WHITE); // Set title color to white
        Instructors.setBorder(instructorTitle);
        addInstructor = new JButton("Add Instructor");
        removeInstructor = new JButton("Remove Instructor");
        viewInstructor = new JButton("View Instructor");
        Instructors.add(addInstructor);
        Instructors.add(removeInstructor);
        Instructors.add(viewInstructor);
        adminLeftSide.add(Instructors);
        Instructors.setBackground(new Color(0, 131, 112));
        addInstructor.setBackground(new Color(237, 237, 237));
        removeInstructor.setBackground(new Color(237, 237, 237));
        viewInstructor.setBackground(new Color(237, 237, 237));

        // -- Actions Panel
        Actions = new JPanel(new GridLayout(4, 1));
        TitledBorder titleActions = BorderFactory.createTitledBorder("Actions (Student)");
        titleActions.setTitleColor(Color.WHITE); // Set the title color to white
        Actions.setBorder(titleActions);
        addStudentToCourse = new JButton("Add To Course");
        removeStudentFromCourse = new JButton("Remove From Course");
        moveStudentFromCourseToAnother = new JButton("Move Student");
        fillGrades = new JButton("Fill Grades");

        fillGrades.setBackground(new Color(237, 237, 237));

        Actions.add(addStudentToCourse);
        Actions.add(removeStudentFromCourse);
        Actions.add(moveStudentFromCourseToAnother);
        Actions.add(fillGrades);
        adminLeftSide.add(Actions);
        Actions.setBackground(new Color(0, 131, 112));
        addStudentToCourse.setBackground(new Color(237, 237, 237));
        removeStudentFromCourse.setBackground(new Color(237, 237, 237));
        moveStudentFromCourseToAnother.setBackground(new Color(237, 237, 237));

        add(adminLeftSide, BorderLayout.WEST);

//       
        // Logo Panel
        logoPic = new ImageIcon(getClass().getResource("/Admin/Images/Logo.png"));
        scaledImage = logoPic.getImage().getScaledInstance(240, 110, Image.SCALE_SMOOTH);
        resizedIcon = new ImageIcon(scaledImage);
        logoLabel = new JLabel(resizedIcon);

        JPanel logoPanel = new JPanel();
        logoPanel.add(logoLabel);
        center.add(logoPanel, BorderLayout.NORTH);
        // Statistics Panel
        statistics = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));

        nbStudents = createStatCard("Number of Students", allStudents.size(), new Color(0, 131, 112));
        nbCourses = createStatCard("Number of Courses", allCourses.size(), new Color(0, 131, 112));
        nbInstructors = createStatCard("Number of Instructors", getAllInstructors().size(), new Color(0, 131, 112));

        statistics.add(nbStudents);
        statistics.add(nbCourses);
        statistics.add(nbInstructors);

        // Create the dashboard panel combining logo and statistics
        JPanel firstDashboardPanelCenter = new JPanel(new BorderLayout(0, 20)); // 10px vertical gap
        firstDashboardPanelCenter.add(logoPanel, BorderLayout.NORTH);
        firstDashboardPanelCenter.add(statistics, BorderLayout.CENTER);

        // Add the dashboard panel to the center with card name "mainDashboard"
        center.add(firstDashboardPanelCenter, "mainDashboard");

        // Show the main dashboard on startup
        CardLayout cl = (CardLayout) center.getLayout();
        cl.show(center, "mainDashboard");

        //  ***************   Add Student GUI  -- Center   *******************
        // Keep the whole design only change the center panel by setting the above one in the admin dashboard (setvisible = false) and set this one true
        addStudentPanel = new JPanel(new BorderLayout());
        addStudentPanel.setBackground(new Color(255, 244, 250));
        addStudentPanel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30)); // padding

        addStudentHeader = new JLabel("Add Student", SwingConstants.CENTER);
        addStudentHeader.setFont(new Font("Segoe UI", Font.BOLD, 16));
        addStudentHeader.setOpaque(true); // Make background visible
        addStudentHeader.setPreferredSize(new Dimension(70, 30));
        addStudentHeader.setBackground(new Color(0, 131, 112));
        addStudentHeader.setForeground(Color.WHITE);

        addStudentPanel.add(addStudentHeader, BorderLayout.NORTH);

        // Create studentDetailsSouth with Note and Button side by side
        addStudentNote = new JLabel("Notes");

        addStudentBtn = new JButton("Add Student");
        addStudentBtn.setBackground(new Color(0, 131, 112));
        addStudentBtn.setForeground(Color.WHITE);
        addStudentBtn.setPreferredSize(new Dimension(7, 40));

        studentDetailsSouth = new JPanel(new GridLayout(1, 2, 10, 0)); // 1 row, 2 cols, horizontal gap
        studentDetailsSouth.setBorder(BorderFactory.createEmptyBorder(30, 0, 0, 0)); // Top padding
        studentDetailsSouth.add(addStudentNote);
        studentDetailsSouth.add(addStudentBtn);

        addStudentPanel.add(studentDetailsSouth, BorderLayout.SOUTH);

        addStudentDetails = new JPanel(new GridLayout(5, 2, 10, 10));
        addStudentDetails.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30)); // padding

        addStudentPanel.add(studentDetailsSouth, BorderLayout.SOUTH);

        name = new JLabel("Name");
        enterName = new JTextField();
        enterName.setFont(new Font("Arial", Font.ITALIC, 18)); // Font name, style, size
        enterName.setHorizontalAlignment(JTextField.CENTER);             // Center text

        JLabel age = new JLabel("Age");
        enterAge = new JTextField();
        enterAge.setFont(new Font("Arial", Font.ITALIC, 18)); // Font name, style, size
        enterAge.setHorizontalAlignment(JTextField.CENTER);             // Center text

        ssn = new JLabel("SSN");
        enterSSN = new JTextField();
        enterSSN.setFont(new Font("Arial", Font.ITALIC, 18)); // Font name, style, size
        enterSSN.setHorizontalAlignment(JTextField.CENTER);             // Center text

        phoneNB = new JLabel("Phone Number");
        enterPhoneNB = new JTextField();
        enterPhoneNB.setFont(new Font("Arial", Font.ITALIC, 18)); // Font name, style, size
        enterPhoneNB.setHorizontalAlignment(JTextField.CENTER);             // Center text

        address = new JLabel("Address");
        enterAddress = new JTextField();
        enterAddress.setFont(new Font("Arial", Font.ITALIC, 18)); // Font name, style, size
        enterAddress.setHorizontalAlignment(JTextField.CENTER);             // Center text

        // Adding elements
        addStudentDetails.add(name);
        addStudentDetails.add(enterName);

        addStudentDetails.add(age);
        addStudentDetails.add(enterAge);

        addStudentDetails.add(ssn);
        addStudentDetails.add(enterSSN);
        addStudentDetails.add(phoneNB);
        addStudentDetails.add(enterPhoneNB);
        addStudentDetails.add(address);
        addStudentDetails.add(enterAddress);

        // Optional: set consistent size
        Dimension fieldSize = new Dimension(100, 25);
        enterName.setPreferredSize(fieldSize);
        enterAge.setPreferredSize(fieldSize);
        enterSSN.setPreferredSize(fieldSize);
        enterPhoneNB.setPreferredSize(fieldSize);
        enterAddress.setPreferredSize(fieldSize);

        Font labelFont = new Font("SansSerif", Font.BOLD, 16);
        name.setFont(labelFont);
        age.setFont(labelFont);
        ssn.setFont(labelFont);
        phoneNB.setFont(labelFont);
        address.setFont(labelFont);

        addStudentPanel.add(addStudentDetails, BorderLayout.CENTER);
        add(addStudentPanel, BorderLayout.CENTER);
        //   addStudentPanel.setVisible(false);

        //  ***************   Remove Student GUI  -- Center   *******************
        // Keep the whole design only change the center panel by setting the above one in the admin dashboard (setvisible = false) and set this one true
        removeStudentPanel = new JPanel(new BorderLayout());
        removeStudentPanel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30)); // Padding around the whole panel
        removeStudentPanel.setBackground(new Color(255, 244, 250));

        // ======= Header =======
        removeStudentHeader = new JLabel("Remove Student", SwingConstants.CENTER);
        removeStudentHeader.setFont(new Font("Segoe UI", Font.BOLD, 16));
        removeStudentHeader.setOpaque(true);
        removeStudentHeader.setPreferredSize(new Dimension(70, 30));
        removeStudentHeader.setBackground(new Color(0, 131, 112));
        removeStudentHeader.setForeground(Color.WHITE);
        removeStudentPanel.add(removeStudentHeader, BorderLayout.NORTH);

        // ======= Center Panel =======
        removeStudentPanelCenter = new JPanel(new GridLayout(4, 1, 10, 10));

        // Sentence
        removeStudentSentence = new JLabel("Enter the ID of the student");
        removeStudentSentence.setHorizontalAlignment(JLabel.CENTER);
        removeStudentSentence.setFont(new Font("Segoe UI", Font.BOLD, 22));
        removeStudentPanelCenter.add(removeStudentSentence);

        // ID Field Row
        enterIDToRemove = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        id = new JLabel("ID:");
        id.setFont(new Font("Segoe UI", Font.BOLD, 20));
        idToRemove = new JTextField();

        idToRemove.setFont(new Font("Arial", Font.ITALIC, 18)); // Font name, style, size
        idToRemove.setHorizontalAlignment(JTextField.CENTER);

        idToRemove.setPreferredSize(new Dimension(150, 40));
        enterIDToRemove.add(id);
        enterIDToRemove.add(idToRemove);
        removeStudentPanelCenter.add(enterIDToRemove);

        // Button
        removeStudentBtnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        removeStudentBtn = new JButton("Remove");
        removeStudentBtn.setBackground(new Color(0, 131, 112));
        removeStudentBtn.setForeground(Color.WHITE);

        removeStudentBtn.setFont(new Font("Segoe UI", Font.BOLD, 18)); // ← Increase size here
        removeStudentBtn.setPreferredSize(new Dimension(110, 50));
        removeStudentBtnPanel.add(removeStudentBtn);
        removeStudentPanelCenter.add(removeStudentBtnPanel);

        // Notes
        removedNotes = new JLabel("Notes: Removed / Not found!");
        removedNotes.setHorizontalAlignment(JLabel.CENTER);
        removedNotes.setFont(new Font("Segoe UI", Font.BOLD, 20));
        removeStudentPanelCenter.add(removedNotes);

        // Add to Main Panel
        removeStudentPanel.add(removeStudentPanelCenter, BorderLayout.CENTER);
        add(removeStudentPanel, BorderLayout.CENTER);

        // ----------------   View / Edit Student Panel   ----------------------
        LabelFont = new Font("Segoe UI", Font.BOLD, 18);
        textFieldFont = new Font("Segoe UI", Font.PLAIN, 16);
        buttonFont = new Font("Segoe UI", Font.BOLD, 16);

        viewStudentPanel = new JPanel(new GridLayout(5, 1, 5, 5));
        viewStudentPanel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30)); // padding
        viewStudentPanel.setBackground(new Color(255, 244, 250));
        viewStudentHeaderSentence = new JLabel("Enter the ID of the student");

        viewStudentHeaderSentence.setOpaque(true); // Make background visible
        viewStudentHeaderSentence.setBackground(new Color(0, 131, 112));
        viewStudentHeaderSentence.setForeground(Color.WHITE);

        viewStudentHeaderSentence.setHorizontalAlignment(JLabel.CENTER);
        viewStudentHeaderSentence.setFont(new Font("Segoe UI", Font.BOLD, 22));
        viewStudentPanel.add(viewStudentHeaderSentence);
        viewStudentEnterID = new JPanel(new FlowLayout());
        viewStudentEnterID.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30)); // padding

        viewPanelEnterID = new JLabel("ID: ");
        viewPanelEnterID.setFont(LabelFont);
        viewID = new JTextField(10);

        viewID.setFont(new Font("Arial", Font.ITALIC, 18)); // Font name, style, size
        viewID.setHorizontalAlignment(JTextField.CENTER);

        viewID.setFont(textFieldFont);
        viewStudentEnterID.add(viewPanelEnterID);
        viewStudentEnterID.add(viewID);
        viewStudentPanel.add(viewStudentEnterID);

        viewStudentDetails = new JPanel(new GridLayout(2, 2, 5, 5));

        viewName = new JPanel(new FlowLayout());
        nameText = new JLabel("               Name");
        nameText.setFont(LabelFont);
        nameResult = new JTextField(10);
        nameResult.setFont(textFieldFont);
        viewName.add(nameText);
        viewName.add(nameResult);
        viewStudentDetails.add(viewName);

        viewSSN = new JPanel(new FlowLayout());
        ssnText = new JLabel("       SSN");
        ssnText.setFont(LabelFont);
        ssnResult = new JTextField(10);
        ssnResult.setFont(textFieldFont);
        viewSSN.add(ssnText);
        viewSSN.add(ssnResult);
        viewStudentDetails.add(viewSSN);

        viewPhoneNB = new JPanel(new FlowLayout());
        phoneNBText = new JLabel("Phone Number");
        phoneNBText.setFont(LabelFont);
        phoneNBResult = new JTextField(10);
        phoneNBResult.setFont(textFieldFont);
        viewPhoneNB.add(phoneNBText);
        viewPhoneNB.add(phoneNBResult);
        viewStudentDetails.add(viewPhoneNB);

        viewAddress = new JPanel(new FlowLayout());
        addressText = new JLabel("Address");
        addressText.setFont(LabelFont);
        addressResult = new JTextField(10);
        addressResult.setFont(textFieldFont);
        viewAddress.add(addressText);
        viewAddress.add(addressResult);
        viewStudentDetails.add(viewAddress);

        nameResult.setEditable(false);
        ssnResult.setEditable(false);
        phoneNBResult.setEditable(false);
        addressResult.setEditable(false);

        viewStudentPanel.add(viewStudentDetails);

        viewPanelButtons = new JPanel(new FlowLayout());
        searchStudent = new JButton("Search");
        editStudent = new JButton("Edit");
        saveStudent = new JButton("Save");

        searchStudent.setBackground(new Color(0, 131, 112));
        searchStudent.setForeground(Color.WHITE);
        editStudent.setBackground(new Color(0, 131, 112));
        editStudent.setForeground(Color.WHITE);
        saveStudent.setBackground(new Color(0, 131, 112));
        saveStudent.setForeground(Color.WHITE);

        searchStudent.setFont(buttonFont);
        editStudent.setFont(buttonFont);
        saveStudent.setFont(buttonFont);

        viewPanelButtons.add(searchStudent);
        viewPanelButtons.add(editStudent);
        viewPanelButtons.add(saveStudent);
        
        viewPanelButtons.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30)); // padding
        
        viewStudentPanel.add(viewPanelButtons);
        
        viewStudentNotes = new JLabel("Notes");
        viewStudentNotes.setFont(LabelFont);
        viewStudentNotes.setHorizontalAlignment(JLabel.CENTER);
        viewStudentNotes.setFont(new Font("Segoe UI", Font.BOLD, 22));
        
        viewStudentPanel.add(viewStudentNotes);
        
        viewStudentPanel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30)); // Padding around the whole panel
        
        add(viewStudentPanel, BorderLayout.CENTER);

        // ----------------------   Add Course Panel   -------------------------
        addCoursesPanel = new JPanel(new BorderLayout());
        addCoursesPanel.setBackground(new Color(255, 244, 250));

        // Header
        addCourseHeader = new JLabel("Add Course");
        addCourseHeader.setOpaque(true); // Make background visible
        addCourseHeader.setPreferredSize(new Dimension(70, 30));
        addCourseHeader.setBackground(new Color(0, 131, 112));
        addCourseHeader.setForeground(Color.WHITE);
        addCourseHeader.setHorizontalAlignment(JLabel.CENTER);
        addCourseHeader.setFont(new Font("Segoe UI", Font.BOLD, 22));
        addCoursesPanel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30)); // padding
        addCoursesPanel.add(addCourseHeader, BorderLayout.NORTH);

        // Center section
        addCourseCenter = new JPanel(new BorderLayout());

        // Course Details Panel (4 fields + status)
        addCourseDetails = new JPanel(new GridLayout(6, 1, 10, 10));
        addCourseDetails.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30)); // padding
        // Course Name
        courseNamePanel = new JPanel(new FlowLayout());
        courseName = new JLabel("Name     ");
        courseName.setFont(labelFont);
        enterCourseName = new JTextField(15);

        enterCourseName.setFont(new Font("Arial", Font.ITALIC, 18)); // Font name, style, size
        enterCourseName.setHorizontalAlignment(JTextField.CENTER);

//        enterCourseName.setFont(textFieldFont);
        courseNamePanel.add(courseName);
        courseNamePanel.add(enterCourseName);
        addCourseDetails.add(courseNamePanel);

        // Course Code
        courseCodePanel = new JPanel(new FlowLayout());
        courseCode = new JLabel("Code      ");
        courseCode.setFont(labelFont);
        enterCourseCode = new JTextField(15);

        enterCourseCode.setFont(new Font("Arial", Font.ITALIC, 18)); // Font name, style, size
        enterCourseCode.setHorizontalAlignment(JTextField.CENTER);

//        enterCourseCode.setFont(textFieldFont);
        courseCodePanel.add(courseCode);
        courseCodePanel.add(enterCourseCode);
        addCourseDetails.add(courseCodePanel);

        // Max number of students
        courseMaxNbStudentsPanel = new JPanel(new FlowLayout());
        courseMaxNbStudents = new JLabel("Max number of Students");
        courseMaxNbStudents.setFont(labelFont);
        enterMaxNbStudents = new JTextField(10);

        enterMaxNbStudents.setFont(new Font("Arial", Font.ITALIC, 18)); // Font name, style, size
        enterMaxNbStudents.setHorizontalAlignment(JTextField.CENTER);

//        enterMaxNbStudents.setFont(textFieldFont);
        courseMaxNbStudentsPanel.add(courseMaxNbStudents);
        courseMaxNbStudentsPanel.add(enterMaxNbStudents);
        addCourseDetails.add(courseMaxNbStudentsPanel);

        // Course Instructor
        JPanel courseAssignInstructorPanel = new JPanel(new FlowLayout());
        JLabel courseInstructor = new JLabel("Instructor     ");
        courseInstructor.setFont(labelFont);
        enterCourseInstructor = new JTextField(15);

        enterCourseInstructor.setFont(new Font("Arial", Font.ITALIC, 18));
        enterCourseInstructor.setHorizontalAlignment(JTextField.CENTER);

        courseAssignInstructorPanel.add(courseInstructor);
        courseAssignInstructorPanel.add(enterCourseInstructor);

        addCourseDetails.add(courseAssignInstructorPanel);

        //Nb of Weeks
        JPanel courseNbWeeksPanel = new JPanel(new FlowLayout());
        JLabel courseNbWeeeksLabel = new JLabel("Number of weeks");
        courseNbWeeeksLabel.setFont(labelFont);
        enterNbWeeks = new JTextField(10);

        enterNbWeeks.setFont(new Font("Arial", Font.ITALIC, 18)); // Font name, style, size
        enterNbWeeks.setHorizontalAlignment(JTextField.CENTER);

//        enterNbWeeks.setFont(textFieldFont);
        courseNbWeeksPanel.add(courseNbWeeeksLabel);
        courseNbWeeksPanel.add(enterNbWeeks);
        addCourseDetails.add(courseNbWeeksPanel);
        enterNbWeeks.setEditable(false);

        // Status (Online / Normal)
        courseStatusPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));

        statusLabel = new JLabel("Status:");
        statusLabel.setFont(new Font("Arial", Font.ITALIC, 20));

        online = new JRadioButton("Online");
        online.setFont(new Font("Arial", Font.PLAIN, 18));

        normal = new JRadioButton("Normal");
        normal.setFont(new Font("Arial", Font.PLAIN, 18));

        ButtonGroup statusGroup = new ButtonGroup();
        statusGroup.add(online);
        statusGroup.add(normal);

        courseStatusPanel.add(statusLabel);
        courseStatusPanel.add(online);
        courseStatusPanel.add(normal);

        addCourseDetails.add(courseStatusPanel);

        // Add all details to center panel
        addCourseCenter.add(addCourseDetails, BorderLayout.CENTER);

        // Buttons row
        // Buttons + Notes Panel
        JPanel addCourseNotesPanel = new JPanel(new GridLayout(2, 1, 5, 5));

        // Buttons row
        JPanel addCourseBtnCenter = new JPanel(new FlowLayout());
        addCourseBtn = new JButton("Add");
        addCourseBtn.setBackground(new Color(0, 131, 112));
        addCourseBtn.setForeground(Color.WHITE);
        addCourseBtn.setFont(new Font("Arial", Font.BOLD, 18));

        addCourseBtnCenter.add(addCourseBtn);

        // Notes label
        courseNotes = new JLabel("Notes");
        courseNotes.setHorizontalAlignment(SwingConstants.CENTER);
        courseNotes.setFont(new Font("Segoe UI", Font.BOLD, 16));

        addCourseNotesPanel.add(addCourseBtnCenter);
        addCourseNotesPanel.add(courseNotes);

        // Add bottom panel to center
        addCourseCenter.add(addCourseNotesPanel, BorderLayout.SOUTH);

        // Add center to main panel
        addCoursesPanel.add(addCourseCenter, BorderLayout.CENTER);

        // Add to main container (e.g., JFrame or parent JPanel)
        add(addCoursesPanel, BorderLayout.CENTER);

        // ----------------------   Remove Course Panel    ---------------------
        removeCoursePanel = new JPanel(new BorderLayout());
        removeCoursePanel.setBackground(new Color(255, 244, 250));
        removeCoursePanel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30)); // padding

        // Header
        removeCourseHeader = new JLabel("Remove Course", SwingConstants.CENTER);
        removeCourseHeader.setFont(new Font("Segoe UI", Font.BOLD, 22));
        removeCourseHeader.setOpaque(true);
        removeCourseHeader.setPreferredSize(new Dimension(70, 30));
        removeCourseHeader.setBackground(new Color(0, 131, 112));
        removeCourseHeader.setForeground(Color.WHITE);
        removeCoursePanel.add(removeCourseHeader, BorderLayout.NORTH);

        // Center Panel
        JPanel removeCourseCenter = new JPanel(new GridLayout(4, 1, 10, 10));

        // Instruction sentence
        JLabel removeCourseSentence = new JLabel("Enter the course code to remove");
        removeCourseSentence.setHorizontalAlignment(JLabel.CENTER);
        removeCourseSentence.setFont(new Font("Segoe UI", Font.BOLD, 22));
        removeCourseCenter.add(removeCourseSentence);

        // Course Code Input Panel
        JPanel enterCourseCodePanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        courseCodeLabel = new JLabel("Course Code:");
        courseCodeLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
        enterCourseToRemove = new JTextField();

        enterCourseToRemove.setFont(new Font("Arial", Font.ITALIC, 18)); // Font name, style, size
        enterCourseToRemove.setHorizontalAlignment(JTextField.CENTER);

        enterCourseToRemove.setPreferredSize(new Dimension(150, 40));
        enterCourseCodePanel.add(courseCodeLabel);
        enterCourseCodePanel.add(enterCourseToRemove);
        removeCourseCenter.add(enterCourseCodePanel);

        // Remove Button Panel
        JPanel removeCourseBtnPanell = new JPanel(new FlowLayout());

        removeCourseBtn = new JButton("Remove");
        removeCourseBtn.setBackground(new Color(0, 131, 112));
        removeCourseBtn.setFont(buttonFont);
        removeCourseBtn.setForeground(Color.WHITE);
        removeCourseBtn.setFont(new Font("Segoe UI", Font.BOLD, 18));
        removeCourseBtn.setPreferredSize(new Dimension(110, 50));
        removeCourseBtnPanell.add(removeCourseBtn);
        removeCourseCenter.add(removeCourseBtnPanell);

        // Notes Panel
        removeCourseNotes = new JLabel("Notes: Removed / Not found!");
        removeCourseNotes.setHorizontalAlignment(JLabel.CENTER);
        removeCourseNotes.setFont(new Font("Segoe UI", Font.BOLD, 20));
        removeCourseCenter.add(removeCourseNotes);

        removeCoursePanel.add(removeCourseCenter, BorderLayout.CENTER);

        // After all panel creation, add them to center
        center.add(addStudentPanel, "addStudent");
        center.add(removeStudentPanel, "removeStudent");
        center.add(viewStudentPanel, "viewStudent");
        center.add(addCoursesPanel, "addCourse");
        center.add(removeCoursePanel, "removeCourse");

        // Add center panel once
        add(center, BorderLayout.CENTER);

// ----------------------   View Course Panel   -------------------------
        viewCoursePanel = new JPanel(new GridLayout(5, 1, 5, 5));
        viewCoursePanel.setBackground(new Color(255, 244, 250));
        viewCoursePanel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
        viewCoursePanel.setBackground(new Color(252, 243, 251));

        // Header
        viewCourseHeader = new JLabel("View Course", SwingConstants.CENTER);
        viewCourseHeader.setOpaque(true);
        viewCourseHeader.setBackground(new Color(0, 131, 112));
        viewCourseHeader.setForeground(Color.WHITE);
        viewCourseHeader.setFont(new Font("Segoe UI", Font.BOLD, 22));
        viewCoursePanel.add(viewCourseHeader);

        // Course Code Input
        viewCourseCodePanel = new JPanel(new FlowLayout());
        viewCourseCodeLabel = new JLabel("Course Code:");
        viewCourseCodeLabel.setFont(LabelFont);
        viewCourseCodeField = new JTextField(15);

        viewCourseCodeField.setFont(new Font("Arial", Font.ITALIC, 18)); // Font name, style, size
        viewCourseCodeField.setHorizontalAlignment(JTextField.CENTER);

//        viewCourseCodeField.setFont(textFieldFont);
        viewCourseCodePanel.add(viewCourseCodeLabel);
        viewCourseCodePanel.add(viewCourseCodeField);
        viewCoursePanel.add(viewCourseCodePanel);

        // Course Details Panel
        courseDetailsPanel = new JPanel(new GridLayout(2, 2, 5, 5));

        // Course Name
        viewNamePanel = new JPanel(new FlowLayout());
        courseNameLabel = new JLabel("Name");
        courseNameLabel.setFont(LabelFont);
        courseNameField = new JTextField(15);

        courseNameField.setFont(new Font("Arial", Font.ITALIC, 18)); // Font name, style, size
        courseNameField.setHorizontalAlignment(JTextField.CENTER);

//        courseNameField.setFont(textFieldFont);
        courseNameField.setEditable(false);
        viewNamePanel.add(courseNameLabel);
        viewNamePanel.add(courseNameField);
        courseDetailsPanel.add(viewNamePanel);

        // Max Students
        viewMaxStudentsPanel = new JPanel(new FlowLayout());
        maxStudentsLabel = new JLabel("Max Students");
        maxStudentsLabel.setFont(LabelFont);
        maxStudentsField = new JTextField(5);

        maxStudentsField.setFont(new Font("Arial", Font.ITALIC, 18)); // Font name, style, size
        maxStudentsField.setHorizontalAlignment(JTextField.CENTER);

//        maxStudentsField.setFont(textFieldFont);
        maxStudentsField.setEditable(false);
        viewMaxStudentsPanel.add(maxStudentsLabel);
        viewMaxStudentsPanel.add(maxStudentsField);
        courseDetailsPanel.add(viewMaxStudentsPanel);

        // Course Type
        viewTypePanel = new JPanel(new FlowLayout());
        typeLabel = new JLabel("  Type");
        typeLabel.setFont(LabelFont);
        typeField = new JTextField(15);

        typeField.setFont(new Font("Arial", Font.ITALIC, 18)); // Font name, style, size
        typeField.setHorizontalAlignment(JTextField.CENTER);

//        typeField.setFont(textFieldFont);
        typeField.setEditable(false);
        viewTypePanel.add(typeLabel);
        viewTypePanel.add(typeField);
        courseDetailsPanel.add(viewTypePanel);

        // Instructor Name
        viewInstructorNamePanel = new JPanel(new FlowLayout());
        courseInstructorNameLabel = new JLabel("Instructor");
        courseInstructorNameLabel.setFont(LabelFont);
        courseInstructorNameField = new JTextField(10);

        courseInstructorNameField.setFont(new Font("Arial", Font.ITALIC, 18)); // Font name, style, size
        courseInstructorNameField.setHorizontalAlignment(JTextField.CENTER);

//        courseNameField.setFont(textFieldFont);
        courseInstructorNameField.setEditable(false);
        viewInstructorNamePanel.add(courseInstructorNameLabel);
        viewInstructorNamePanel.add(courseInstructorNameField);
        courseDetailsPanel.add(viewInstructorNamePanel);

        viewCoursePanel.add(courseDetailsPanel);

        // Buttons Panel
        viewCourseButtonsPanel = new JPanel(new FlowLayout());
        searchCourseBtn = new JButton("Search");
        editCourseBtn = new JButton("Edit");
        saveCourseBtn = new JButton("Save");

        // Styling buttons
        searchCourseBtn.setBackground(new Color(0, 131, 112));
        searchCourseBtn.setForeground(Color.WHITE);
        editCourseBtn.setBackground(new Color(0, 131, 112));
        editCourseBtn.setForeground(Color.WHITE);
        saveCourseBtn.setBackground(new Color(0, 131, 112));
        saveCourseBtn.setForeground(Color.WHITE);

        searchCourseBtn.setFont(buttonFont);
        editCourseBtn.setFont(buttonFont);
        saveCourseBtn.setFont(buttonFont);

        viewCourseButtonsPanel.add(searchCourseBtn);
        viewCourseButtonsPanel.add(editCourseBtn);
        viewCourseButtonsPanel.add(saveCourseBtn);
        viewCoursePanel.add(viewCourseButtonsPanel);

        // Notes
        viewCourseNotes = new JLabel("Notes");
        viewCourseNotes.setFont(LabelFont);
        viewCourseNotes.setHorizontalAlignment(JLabel.CENTER);
        viewCourseNotes.setFont(new Font("Segoe UI", Font.BOLD, 22));
        viewCoursePanel.add(viewCourseNotes);

        // Add to center card layout
        center.add(viewCoursePanel, "viewCourse");

        //  ***************   Add Instructor GUI  -- Center   *******************
        JPanel addInstructorPanel = new JPanel(new BorderLayout());
        addInstructorPanel.setBackground(new Color(255, 244, 250));
        addInstructorPanel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30)); // padding

        JLabel addInstructorHeader = new JLabel("Add Instructor", SwingConstants.CENTER);
        addInstructorHeader.setFont(new Font("Segoe UI", Font.BOLD, 16));
        addInstructorHeader.setOpaque(true); // Make background visible
        addInstructorHeader.setPreferredSize(new Dimension(70, 30));
        addInstructorHeader.setBackground(new Color(0, 131, 112));
        addInstructorHeader.setForeground(Color.WHITE);

        addInstructorPanel.add(addInstructorHeader, BorderLayout.NORTH);

        // Create studentDetailsSouth with Note and Button side by side
        addInstructorNote = new JLabel("Notes");

        addInstructorBtn = new JButton("Add Instructor");
        addInstructorBtn.setBackground(new Color(0, 131, 112));
        addInstructorBtn.setForeground(Color.WHITE);
        addInstructorBtn.setPreferredSize(new Dimension(7, 40));

        JPanel instructorDetailsSouth = new JPanel(new GridLayout(1, 2, 10, 0)); // 1 row, 2 cols, horizontal gap
        instructorDetailsSouth.setBorder(BorderFactory.createEmptyBorder(30, 0, 0, 0)); // Top padding
        instructorDetailsSouth.add(addInstructorNote);
        instructorDetailsSouth.add(addInstructorBtn);

        addInstructorPanel.add(instructorDetailsSouth, BorderLayout.SOUTH);

        JPanel addInstructorDetails = new JPanel(new BorderLayout());
        addInstructorDetails.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));

        addInstructorPanel.add(instructorDetailsSouth, BorderLayout.SOUTH);

        JLabel instructorName = new JLabel("        Name");
        enterInstructoName = new JTextField(30);

        JPanel addInstructorSSN = new JPanel();
        JLabel instructorSSN = new JLabel("SSN:");

        addInstructorSSN.add(instructorSSN);
        addInstructorSSN.add(enterInstructorSSN = new JTextField(10));

        JPanel addInstructorPhoneNB = new JPanel();
        JLabel instructorPhoneNB = new JLabel("Phone Number");
        enterInstructorPhoneNB = new JTextField(10);
        addInstructorPhoneNB.add(instructorPhoneNB);
        addInstructorPhoneNB.add(enterInstructorPhoneNB);

        JPanel addInstructorAddress = new JPanel();
        JLabel instructorAddress = new JLabel("Address");
        enterInstructorAddress = new JTextField(10);
        addInstructorAddress.add(instructorAddress);
        addInstructorAddress.add(enterInstructorAddress);

        JPanel addInstructorAge = new JPanel();
        JLabel instructorAge = new JLabel("Age");
        enterInstructorAge = new JTextField(10);
        addInstructorAge.add(instructorAge);
        addInstructorAge.add(enterInstructorAge);

        JPanel addInstructorDepartment = new JPanel();
        JLabel instructorDepartment = new JLabel("Department");
        enterInstructorDepartment = new JTextField(10);
        addInstructorDepartment.add(instructorDepartment);
        addInstructorDepartment.add(enterInstructorDepartment);

        JPanel addInstructorMajor = new JPanel();
        JLabel instructorMajor = new JLabel("Major");
        enterInstructorMajor = new JTextField(10);
        addInstructorMajor.add(instructorMajor);
        addInstructorMajor.add(enterInstructorMajor);

        JPanel addInstructorName = new JPanel(new FlowLayout(FlowLayout.CENTER));
        addInstructorName.add(instructorName);
        addInstructorName.add(enterInstructoName);
        addInstructorDetails.add(addInstructorName, BorderLayout.NORTH);

        JPanel addInstructorCenterDetails = new JPanel(new GridLayout(3, 2, 5, 5));
        addInstructorCenterDetails.add(addInstructorSSN);
        addInstructorCenterDetails.add(addInstructorPhoneNB);
        addInstructorCenterDetails.add(addInstructorAddress);
        addInstructorCenterDetails.add(addInstructorAge);
        addInstructorCenterDetails.add(addInstructorMajor);
        addInstructorCenterDetails.add(addInstructorDepartment);
        addInstructorDetails.add(addInstructorCenterDetails);

        instructorDetailsSouth.setBorder(BorderFactory.createEmptyBorder(30, 0, 0, 0)); // Top padding
        addInstructorCenterDetails.setBorder(BorderFactory.createEmptyBorder(30, 0, 0, 0)); // Top padding


        enterInstructoName.setPreferredSize(fieldSize);
        enterInstructorSSN.setPreferredSize(fieldSize);
        enterInstructorPhoneNB.setPreferredSize(fieldSize);
        enterInstructorAddress.setPreferredSize(fieldSize);

        // Font labelFont = new Font("SansSerif", Font.BOLD, 16);
        instructorName.setFont(labelFont);
        instructorSSN.setFont(labelFont);
        instructorPhoneNB.setFont(labelFont);
        instructorAddress.setFont(labelFont);
        instructorMajor.setFont(labelFont);
        instructorDepartment.setFont(labelFont);
        instructorAge.setFont(labelFont);

        enterInstructorAge.setFont(new Font("Arial", Font.ITALIC, 18));
        enterInstructorAge.setHorizontalAlignment(JTextField.CENTER);

        enterInstructorSSN.setFont(new Font("Arial", Font.ITALIC, 18));
        enterInstructorSSN.setHorizontalAlignment(JTextField.CENTER);

        enterInstructorAddress.setFont(new Font("Arial", Font.ITALIC, 18));
        enterInstructorAddress.setHorizontalAlignment(JTextField.CENTER);

        enterInstructorPhoneNB.setFont(new Font("Arial", Font.ITALIC, 18)); 
        enterInstructorPhoneNB.setHorizontalAlignment(JTextField.CENTER);

        enterInstructorMajor.setFont(new Font("Arial", Font.ITALIC, 18));
        enterInstructorMajor.setHorizontalAlignment(JTextField.CENTER);

        enterInstructorDepartment.setFont(new Font("Arial", Font.ITALIC, 18)); 
        enterInstructorDepartment.setHorizontalAlignment(JTextField.CENTER);

        addInstructorPanel.add(addInstructorDetails, BorderLayout.CENTER);
        center.add(addInstructorPanel, "addInstructor"); 

        // ----------------------   Remove Instructor Panel    ---------------------
        JPanel removeInstructorPanel = new JPanel(new BorderLayout());
        removeInstructorPanel.setBackground(new Color(255, 244, 250));
        removeInstructorPanel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30)); // padding

        // Header
        JLabel removeInstructorHeader = new JLabel("Remove Instructor", SwingConstants.CENTER);
        removeInstructorHeader.setFont(new Font("Segoe UI", Font.BOLD, 22));
        removeInstructorHeader.setOpaque(true);
        removeInstructorHeader.setPreferredSize(new Dimension(70, 30));
        removeInstructorHeader.setBackground(new Color(0, 131, 112));
        removeInstructorHeader.setForeground(Color.WHITE);
        removeInstructorPanel.add(removeInstructorHeader, BorderLayout.NORTH);

        // Center Panel
        JPanel removeInstructorCenter = new JPanel(new GridLayout(4, 1, 10, 10));

        // Instruction sentence
        JLabel removeInstructorSentence = new JLabel("Enter the instructor name to remove");
        removeInstructorSentence.setHorizontalAlignment(JLabel.CENTER);
        removeInstructorSentence.setFont(new Font("Segoe UI", Font.BOLD, 22));
        removeInstructorCenter.add(removeInstructorSentence);

        // Course Code Input Panel
        JPanel enterInstructorNamePanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        JLabel InstructorNameLabel = new JLabel("Instructor name:");
        InstructorNameLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
        enterInstructorNameToRemove = new JTextField();

        enterInstructorNameToRemove.setFont(new Font("Arial", Font.ITALIC, 18)); // Font name, style, size
        enterInstructorNameToRemove.setHorizontalAlignment(JTextField.CENTER);

        enterInstructorNameToRemove.setPreferredSize(new Dimension(150, 40));
        enterInstructorNamePanel.add(InstructorNameLabel);
        enterInstructorNamePanel.add(enterInstructorNameToRemove);
        removeInstructorCenter.add(enterInstructorNamePanel);

        // Remove Button Panel
        JPanel removeInstructorButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton removeInstructorBtn = new JButton("Remove");
        removeInstructorBtn.setBackground(new Color(0, 131, 112));
        removeInstructorBtn.setForeground(Color.WHITE);
        removeInstructorBtn.setFont(new Font("Segoe UI", Font.BOLD, 18));
        removeInstructorBtn.setPreferredSize(new Dimension(110, 50));
        removeInstructorButtonPanel.add(removeInstructorBtn);
        removeInstructorCenter.add(removeInstructorButtonPanel);

        // Notes Panel
        removeInstructorNotes = new JLabel("Notes: Removed / Not found!");
        removeInstructorNotes.setHorizontalAlignment(JLabel.CENTER);
        removeInstructorNotes.setFont(new Font("Segoe UI", Font.BOLD, 20));
        removeInstructorCenter.add(removeInstructorNotes);

        removeInstructorPanel.add(removeInstructorCenter, BorderLayout.CENTER);
        center.add(removeInstructorPanel, "removeInstructor");

        removeInstructor.addActionListener(new removeInstructorAction());
        removeInstructorBtn.addActionListener(new removeInstructorBtnAction());

//  ***************   View Edit Instructor GUI  -- Center   *******************
        JPanel viewInstructorPanel = new JPanel(new GridLayout(5, 1, 5, 5));
        viewInstructorPanel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
        viewInstructorPanel.setBackground(new Color(255, 244, 250));

// Header
        JLabel viewInstructorHeaderSentence = new JLabel("View Instructor");
        viewInstructorHeaderSentence.setOpaque(true);
        viewInstructorHeaderSentence.setBackground(new Color(0, 131, 112));
        viewInstructorHeaderSentence.setForeground(Color.WHITE);
        viewInstructorHeaderSentence.setHorizontalAlignment(JLabel.CENTER);
        viewInstructorHeaderSentence.setFont(new Font("Segoe UI", Font.BOLD, 22));
        viewInstructorPanel.add(viewInstructorHeaderSentence);

// Search panel
        JPanel viewInstructorEnterName = new JPanel(new FlowLayout());
        viewInstructorEnterName.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
        viewInstructorEnterName.setBounds(250, 60, 200, 30);
        viewInstructorEnterName.setBackground(new Color(255, 244, 250));

        JLabel viewPanelEnterName = new JLabel("Name: ");
        viewPanelEnterName.setFont(LabelFont);
        viewInstructorNameField = new JTextField(10);

        viewInstructorNameField.setFont(new Font("Arial", Font.ITALIC, 18)); // Font name, style, size
        viewInstructorNameField.setHorizontalAlignment(JTextField.CENTER);

        // Make background and border consistent with other text fields:
        viewInstructorNameField.setBackground(Color.WHITE);
        //  viewInstructorNameField.setBounds(250,60,200,30);

        viewInstructorNameField.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(200, 200, 200)),
                BorderFactory.createEmptyBorder(5, 8, 5, 8)
        ));

        viewInstructorEnterName.add(viewPanelEnterName);
        viewInstructorEnterName.add(viewInstructorNameField);
        viewInstructorPanel.add(viewInstructorEnterName);

        // Details panel - GridLayout(3, 2) for 6 fields
        JPanel viewInstructorDetails = new JPanel(new GridLayout(3, 2, 5, 5));

        viewInstructorDetails.setBackground(new Color(255, 244, 250));
        // SSN Field
        JPanel ssnPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        ssnPanel.setBackground(new Color(255, 244, 250));
        ssnText = new JLabel("SSN");
        ssnText.setFont(LabelFont);
        viewInstructorSSNResult = new JTextField(16);
        viewInstructorSSNResult.setFont(textFieldFont);
        viewInstructorSSNResult.setEditable(false);

        ssnPanel.add(ssnText);

        ssnPanel.add(viewInstructorSSNResult);

        // Phone Number Field
        JPanel phonePanel = new JPanel(new FlowLayout());
        phonePanel.setBackground(new Color(255, 244, 250));
        JLabel phoneText = new JLabel("Phone Number");
        phoneText.setFont(LabelFont);
        viewInstructorPhoneResult = new JTextField(10);

        viewInstructorPhoneResult.setFont(new Font("Arial", Font.ITALIC, 18)); 
        viewInstructorPhoneResult.setHorizontalAlignment(JTextField.CENTER);

        viewInstructorPhoneResult.setEditable(false);

        phonePanel.add(phoneText);
        phonePanel.add(viewInstructorPhoneResult);

        // Address Field
        JPanel addressPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        addressPanel.setBackground(new Color(255, 244, 250));
        addressText = new JLabel("Address");
        addressText.setFont(LabelFont);
        viewInstructorAddressResult = new JTextField(14);

        viewInstructorAddressResult.setFont(new Font("Arial", Font.ITALIC, 18)); // Font name, style, size
        viewInstructorAddressResult.setHorizontalAlignment(JTextField.CENTER);

        viewInstructorAddressResult.setEditable(false);
        addressPanel.add(addressText);
        addressPanel.add(viewInstructorAddressResult);

        // Age Field
        JPanel agePanel = new JPanel(new FlowLayout());
        agePanel.setBackground(new Color(255, 244, 250));
        JLabel ageText = new JLabel("                   Age");
        ageText.setFont(LabelFont);
        viewInstructorAgeResult = new JTextField(10);

        viewInstructorAgeResult.setFont(new Font("Arial", Font.ITALIC, 18));
        viewInstructorAgeResult.setHorizontalAlignment(JTextField.CENTER);

        viewInstructorAgeResult.setEditable(false);
        agePanel.add(ageText);
        agePanel.add(viewInstructorAgeResult);

        // Department Field
        JPanel deptPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        deptPanel.setBackground(new Color(255, 244, 250));
        JLabel deptText = new JLabel("Department");
        deptText.setFont(LabelFont);
        viewInstructorDeptResult = new JTextField(12);

        viewInstructorDeptResult.setFont(new Font("Arial", Font.ITALIC, 18)); 
        viewInstructorDeptResult.setHorizontalAlignment(JTextField.CENTER);

        viewInstructorDeptResult.setEditable(false);
        deptPanel.add(deptText);
        deptPanel.add(viewInstructorDeptResult);

        // Major Field
        JPanel majorPanel = new JPanel(new FlowLayout());
        majorPanel.setBackground(new Color(255, 244, 250));
        JLabel majorText = new JLabel("                Major");
        majorText.setFont(LabelFont);
        viewInstructorMajorResult = new JTextField(10);

        viewInstructorMajorResult.setFont(new Font("Arial", Font.ITALIC, 18));
        viewInstructorMajorResult.setHorizontalAlignment(JTextField.CENTER);

        viewInstructorMajorResult.setEditable(false);
        majorPanel.add(majorText);
        majorPanel.add(viewInstructorMajorResult);

        // Add all to details panel
        viewInstructorDetails.add(ssnPanel);
        viewInstructorDetails.add(phonePanel);
        viewInstructorDetails.add(addressPanel);
        viewInstructorDetails.add(agePanel);
        viewInstructorDetails.add(deptPanel);
        viewInstructorDetails.add(majorPanel);

        viewInstructorPanel.add(viewInstructorDetails);

        // Buttons panel
        viewPanelButtons = new JPanel(new FlowLayout());
        viewPanelButtons.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
        viewPanelButtons.setBackground(new Color(255, 244, 250));

        searchInstructor = new JButton("Search");
        editInstructor = new JButton("Edit");
        saveInstructor = new JButton("Save");

        searchInstructor.setBackground(new Color(0, 131, 112));
        searchInstructor.setForeground(Color.WHITE);
        editInstructor.setBackground(new Color(0, 131, 112));
        editInstructor.setForeground(Color.WHITE);
        saveInstructor.setBackground(new Color(0, 131, 112));
        saveInstructor.setForeground(Color.WHITE);

        searchInstructor.setFont(buttonFont);
        editInstructor.setFont(buttonFont);
        saveInstructor.setFont(buttonFont);

        viewPanelButtons.add(searchInstructor);
        viewPanelButtons.add(editInstructor);
        viewPanelButtons.add(saveInstructor);

        viewInstructorPanel.add(viewPanelButtons);

        // Notes panel
        viewInstructorNotes = new JLabel("Notes");
        viewInstructorNotes.setFont(new Font("Segoe UI", Font.BOLD, 22));
        viewInstructorNotes.setHorizontalAlignment(JLabel.CENTER);
        viewInstructorNotes.setBackground(new Color(255, 244, 250));
        viewInstructorPanel.add(viewInstructorNotes);

        // Add to card layout
        center.add(viewInstructorPanel, "viewInstructor");
        viewInstructor.addActionListener(new viewInstructorAction());
        searchInstructor.addActionListener(new searchInstructorBtnAction());
        editInstructor.addActionListener(new ViewEditInstructorBtnAction());
        saveInstructor.addActionListener(new saveInstructorBtnAction());

        // ---------------------- Add Student to a Course Panel ----------------------
        JPanel addStudentCoursePanel = new JPanel(new BorderLayout());
        addStudentCoursePanel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
        addStudentCoursePanel.setBackground(new Color(255, 244, 250));

        // Header
        JLabel addStudentCourseHeader = new JLabel("Add Student to a Course", SwingConstants.CENTER);
        addStudentCourseHeader.setFont(new Font("Segoe UI", Font.BOLD, 16));
        addStudentCourseHeader.setOpaque(true);
        addStudentCourseHeader.setPreferredSize(new Dimension(70, 30));
        addStudentCourseHeader.setBackground(new Color(0, 131, 112));
        addStudentCourseHeader.setForeground(Color.WHITE);
        addStudentCoursePanel.add(addStudentCourseHeader, BorderLayout.NORTH);

        // Center Panel
        JPanel addStudentCourseCenterPanel = new JPanel(new GridLayout(5, 1, 10, 10));

        // Instruction Label
        JLabel instructionLabel = new JLabel("Enter the student ID and course code", SwingConstants.CENTER);
        instructionLabel.setFont(new Font("Segoe UI", Font.BOLD, 22));
        addStudentCourseCenterPanel.add(instructionLabel);

        // Student ID Field
        JPanel studentIdPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        JLabel studentIdLabel = new JLabel("Student ID:");
        studentIdLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
        studentInstructorIdField = new JTextField();

        studentInstructorIdField.setFont(new Font("Arial", Font.ITALIC, 18)); 
        studentInstructorIdField.setHorizontalAlignment(JTextField.CENTER);

        studentInstructorIdField.setPreferredSize(new Dimension(150, 40));
        studentIdPanel.add(studentIdLabel);
        studentIdPanel.add(studentInstructorIdField);
        addStudentCourseCenterPanel.add(studentIdPanel);

        // Course Code Field
        JPanel courseCodePanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        JLabel courseCodeLabel = new JLabel("Course Code:");
        courseCodeLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
        courseCodeFieldAddStudent = new JTextField();

        courseCodeFieldAddStudent.setFont(new Font("Arial", Font.ITALIC, 18));
        courseCodeFieldAddStudent.setHorizontalAlignment(JTextField.CENTER);

        courseCodeFieldAddStudent.setPreferredSize(new Dimension(150, 40));
        courseCodePanel.add(courseCodeLabel);
        courseCodePanel.add(courseCodeFieldAddStudent);
        addStudentCourseCenterPanel.add(courseCodePanel);

        // Button Panel
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        addStudentCourseButton = new JButton("Add");
        addStudentCourseButton.setBackground(new Color(0, 131, 112));
        addStudentCourseButton.setForeground(Color.WHITE);
        addStudentCourseButton.setFont(new Font("Segoe UI", Font.BOLD, 18));
        addStudentCourseButton.setPreferredSize(new Dimension(110, 50));
        buttonPanel.add(addStudentCourseButton);
        addStudentCourseCenterPanel.add(buttonPanel);

        // Notes Label
        notesLabel = new JLabel("Notes: Added / Not found!", SwingConstants.CENTER);
        notesLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
        addStudentCourseCenterPanel.add(notesLabel);

        addStudentCoursePanel.add(addStudentCourseCenterPanel, BorderLayout.CENTER);
        center.add(addStudentCoursePanel, "addStudentCourse");

        // ---------------------- Remove Student from a Course Panel ----------------------
        JPanel removeStudentFromCoursePanel = new JPanel(new BorderLayout());
        removeStudentFromCoursePanel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
        removeStudentFromCoursePanel.setBackground(new Color(255, 244, 250));

        // Header
        JLabel removeStudentCourseHeader = new JLabel("Remove Student from a Course", SwingConstants.CENTER);
        removeStudentCourseHeader.setFont(new Font("Segoe UI", Font.BOLD, 16));
        removeStudentCourseHeader.setOpaque(true);
        removeStudentCourseHeader.setPreferredSize(new Dimension(70, 30));
        removeStudentCourseHeader.setBackground(new Color(0, 131, 112));
        removeStudentCourseHeader.setForeground(Color.WHITE);
        removeStudentFromCoursePanel.add(removeStudentCourseHeader, BorderLayout.NORTH);

        // Center Panel
        JPanel removeStudentCourseCenterPanel = new JPanel(new GridLayout(5, 1, 10, 10));

        // Instruction
        JLabel removeInstructionLabel = new JLabel("Enter the student ID and course code", SwingConstants.CENTER);
        removeInstructionLabel.setFont(new Font("Segoe UI", Font.BOLD, 22));
        removeStudentCourseCenterPanel.add(removeInstructionLabel);

        // Student ID Input
        JPanel removeStudentIdPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        JLabel removeStudentIdLabel = new JLabel("Student ID:");
        removeStudentIdLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
        removeStudentIdField = new JTextField();

        removeStudentIdField.setFont(new Font("Arial", Font.ITALIC, 18)); // Font name, style, size
        removeStudentIdField.setHorizontalAlignment(JTextField.CENTER);

        removeStudentIdField.setPreferredSize(new Dimension(150, 40));
        removeStudentIdPanel.add(removeStudentIdLabel);
        removeStudentIdPanel.add(removeStudentIdField);
        removeStudentCourseCenterPanel.add(removeStudentIdPanel);

        // Course Code Input
        JPanel removeCourseCodePanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        JLabel removeCourseCodeLabel = new JLabel("Course Code:");
        removeCourseCodeLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
        removeCourseCodeField = new JTextField();

        removeCourseCodeField.setFont(new Font("Arial", Font.ITALIC, 18)); 
        removeCourseCodeField.setHorizontalAlignment(JTextField.CENTER);

        removeCourseCodeField.setPreferredSize(new Dimension(150, 40));
        removeCourseCodePanel.add(removeCourseCodeLabel);
        removeCourseCodePanel.add(removeCourseCodeField);
        removeStudentCourseCenterPanel.add(removeCourseCodePanel);

        // Remove Button
        JPanel removeButtonPanelStudentCourse = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton removeStudentCourseButton = new JButton("Remove");
        removeStudentCourseButton.setBackground(new Color(0, 131, 112));
        removeStudentCourseButton.setForeground(Color.WHITE);
        removeStudentCourseButton.setFont(new Font("Segoe UI", Font.BOLD, 18));
        removeStudentCourseButton.setPreferredSize(new Dimension(110, 50));
        removeButtonPanelStudentCourse.add(removeStudentCourseButton);
        removeStudentCourseCenterPanel.add(removeButtonPanelStudentCourse);

// Notes
        removeNotesLabel = new JLabel("Notes: Removed / Not found!", SwingConstants.CENTER);
        removeNotesLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
        removeStudentCourseCenterPanel.add(removeNotesLabel);

        removeStudentFromCoursePanel.add(removeStudentCourseCenterPanel, BorderLayout.CENTER);

        center.add(removeStudentFromCoursePanel, "removeStudentFromCourse");

        // ------------------------- Move Student ---------------------------------------
        JPanel moveStudentPanel = new JPanel(new BorderLayout());
        moveStudentPanel.setBackground(new Color(255, 244, 250));

        // Header
        JLabel moveStudentHeader = new JLabel("Move Student From Course To Another", SwingConstants.CENTER);
        moveStudentHeader.setHorizontalAlignment(SwingConstants.CENTER);
        moveStudentHeader.setPreferredSize(new Dimension(400, 70)); // adjust as needed

        moveStudentHeader.setVerticalAlignment(SwingConstants.CENTER);
        moveStudentHeader.setFont(new Font("Segoe UI", Font.BOLD, 18));
        moveStudentHeader.setOpaque(true); // Make background visible
        moveStudentHeader.setBackground(new Color(0, 131, 112));
        moveStudentHeader.setForeground(Color.WHITE);
        moveStudentPanel.add(moveStudentHeader, BorderLayout.NORTH);

        JPanel moveStudentDetailsCenter = new JPanel(new GridLayout(3, 1, 10, 10));
        moveStudentDetailsCenter.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30)); 

        // Student ID
        JPanel moveStudentID = new JPanel(new FlowLayout());
        JLabel moveStudentIDLabel = new JLabel("Student ID: ");
        enterStudentIDToRemove = new JTextField();

        enterStudentIDToRemove.setFont(new Font("Arial", Font.ITALIC, 18));
        enterStudentIDToRemove.setHorizontalAlignment(JTextField.CENTER);

        moveStudentIDLabel.setFont(LabelFont);

        moveStudentID.add(moveStudentIDLabel);
        moveStudentID.add(enterStudentIDToRemove);
        moveStudentDetailsCenter.add(moveStudentID);

        // From Course
        JPanel moveStudentFromCourse = new JPanel(new FlowLayout());
        JLabel moveStudentFromCourseLabel = new JLabel("From Course (Code): ");
        enterInitialCourse = new JTextField();

        enterInitialCourse.setFont(new Font("Arial", Font.ITALIC, 18)); 
        enterInitialCourse.setHorizontalAlignment(JTextField.CENTER);

        moveStudentFromCourseLabel.setFont(LabelFont);

        moveStudentFromCourse.add(moveStudentFromCourseLabel);
        moveStudentFromCourse.add(enterInitialCourse);
        moveStudentDetailsCenter.add(moveStudentFromCourse);

        // To Course
        JPanel moveStudentToCourse = new JPanel(new FlowLayout());
        JLabel moveStudentToCourseLabel = new JLabel("To Course (Code): ");
        moveStudentToCourseLabel.setFont(LabelFont);
        enterFinalCourse = new JTextField();

        enterFinalCourse.setFont(new Font("Arial", Font.ITALIC, 18)); 
        enterFinalCourse.setHorizontalAlignment(JTextField.CENTER);

        moveStudentToCourse.add(moveStudentToCourseLabel);
        moveStudentToCourse.add(enterFinalCourse);
        moveStudentDetailsCenter.add(moveStudentToCourse);

        moveStudentPanel.add(moveStudentDetailsCenter, BorderLayout.CENTER);
        moveStudentPanel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));

        Dimension inputSize = new Dimension(300, 30);
        enterStudentIDToRemove.setPreferredSize(inputSize);
        enterInitialCourse.setPreferredSize(inputSize);
        enterFinalCourse.setPreferredSize(inputSize);

        // Move Student South (Button Move + Notes)
        JPanel moveStudentSouth = new JPanel(new GridLayout(2, 1));

        // Button
        JButton moveStudentBtn = new JButton("Move");
        moveStudentBtn.setBackground(new Color(0, 131, 112));
        moveStudentBtn.setForeground(Color.WHITE);
        moveStudentBtn.setPreferredSize(new Dimension(120, 45)); // Smaller width
        moveStudentBtn.setFont(new Font("Segoe UI", Font.BOLD, 16));

        // Wrap the button in a center-aligned panel
        JPanel buttonWrapper = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonWrapper.add(moveStudentBtn);

        // Notes label
        moveStudentNotes = new JLabel("Notes: Moved Successfully / Action Denied");
        moveStudentNotes.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));

        // Wrap the label in a center-aligned panel too
        JPanel notesWrapper = new JPanel(new FlowLayout(FlowLayout.CENTER));
        notesWrapper.add(moveStudentNotes);

        // Add both to the south panel
        moveStudentSouth.add(buttonWrapper);
        moveStudentSouth.add(notesWrapper);

        moveStudentPanel.add(moveStudentSouth, BorderLayout.SOUTH);
        center.add(moveStudentPanel, "moveStudent");

        // ---------------------- Fill Grades Panel ---------------------
        JPanel fillGradesPanel = new JPanel(new BorderLayout());
        fillGradesPanel.setBackground(new Color(255, 244, 250));
        fillGradesPanel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));

// Header
        JLabel fillGradesHeader = new JLabel("Fill Grades", SwingConstants.CENTER);
        fillGradesHeader.setFont(new Font("Segoe UI", Font.BOLD, 22));
        fillGradesHeader.setOpaque(true);
        fillGradesHeader.setPreferredSize(new Dimension(70, 30));
        fillGradesHeader.setBackground(new Color(0, 131, 112));
        fillGradesHeader.setForeground(Color.WHITE);
        fillGradesPanel.add(fillGradesHeader, BorderLayout.NORTH);

// Center Panel
        JPanel fillGradesCenter = new JPanel(new GridLayout(4, 1, 10, 10));

// Instruction sentence
        JLabel fillGradesSentence = new JLabel("Enter the course code");
        fillGradesSentence.setHorizontalAlignment(JLabel.CENTER);
        fillGradesSentence.setFont(new Font("Segoe UI", Font.BOLD, 22));
        fillGradesCenter.add(fillGradesSentence);

// Course Code Input Panel
        JPanel enterCourseCodeFillGradesPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        JLabel courseCodeGradesLabel = new JLabel("Course Code:");
        courseCodeGradesLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
        enterCourseCodeToFill = new JTextField();

        enterCourseCodeToFill.setFont(new Font("Arial", Font.ITALIC, 18)); // Font name, style, size
        enterCourseCodeToFill.setHorizontalAlignment(JTextField.CENTER);

        enterCourseCodeToFill.setPreferredSize(new Dimension(150, 40));
        enterCourseCodeFillGradesPanel.add(courseCodeGradesLabel);
        enterCourseCodeFillGradesPanel.add(enterCourseCodeToFill);
        fillGradesCenter.add(enterCourseCodeFillGradesPanel);

// Fill Button Panel
        JPanel FillGradesBtnPanel = new JPanel(new FlowLayout());
        FillGradesBtn = new JButton("Fill");
        FillGradesBtn.setBackground(new Color(0, 131, 112));
        FillGradesBtn.setForeground(Color.WHITE);
        FillGradesBtn.setFont(new Font("Segoe UI", Font.BOLD, 18));
        FillGradesBtn.setPreferredSize(new Dimension(110, 50));

        FillGradesBtnPanel.add(FillGradesBtn);
//        FillGradesBtnPanel.add(finishButton);
        fillGradesCenter.add(FillGradesBtnPanel);

// Notes Panel
        FillGradesNotes = new JLabel("Notes ");
        FillGradesNotes.setHorizontalAlignment(JLabel.CENTER);
        FillGradesNotes.setFont(new Font("Segoe UI", Font.BOLD, 20));
        fillGradesCenter.add(FillGradesNotes);

        fillGradesPanel.add(fillGradesCenter, BorderLayout.CENTER);

// ---------------------- Filling Grades Details Panel ---------------------
        JPanel fillingGradeDetailsPanel = new JPanel(new BorderLayout());
        fillingGradeDetailsPanel.setBackground(new Color(255, 244, 250));
        fillingGradeDetailsPanel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));

// Header
        JLabel fillingGradesOfStudentsHeader = new JLabel("Fill Grades", SwingConstants.CENTER);
        fillingGradesOfStudentsHeader.setFont(new Font("Segoe UI", Font.BOLD, 22));
        fillingGradesOfStudentsHeader.setOpaque(true);
        fillingGradesOfStudentsHeader.setPreferredSize(new Dimension(70, 30));
        fillingGradesOfStudentsHeader.setBackground(new Color(0, 131, 112));
        fillingGradesOfStudentsHeader.setForeground(Color.WHITE);
        fillingGradeDetailsPanel.add(fillingGradesOfStudentsHeader, BorderLayout.NORTH);

// Center content
        JPanel fillingContentPanel = new JPanel(new GridLayout(4, 1, 10, 10));
        fillingContentPanel.setOpaque(false);
        fillingContentPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel studentGradeToFillGrade = new JLabel("Enter the grade of student ", SwingConstants.CENTER);
        studentGradeToFillGrade.setFont(new Font("Segoe UI", Font.BOLD, 20));
        fillingContentPanel.add(studentGradeToFillGrade);

// Student name label
        studentNameToFillGrade = new JLabel("Name", SwingConstants.CENTER);
        studentNameToFillGrade.setFont(new Font("Segoe UI", Font.BOLD, 20));
        fillingContentPanel.add(studentNameToFillGrade);

// Grade input field
        fillingGradeOfStudentText = new JTextField(10);

        fillingGradeOfStudentText.setFont(new Font("Arial", Font.ITALIC, 18)); // Font name, style, size
        fillingGradeOfStudentText.setHorizontalAlignment(JTextField.CENTER);

        JPanel inputGradePanel = new JPanel(new FlowLayout());
        inputGradePanel.setOpaque(false);
        inputGradePanel.add(fillingGradeOfStudentText);
        fillingContentPanel.add(inputGradePanel);

// Button Panel
        JPanel FillGradesButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        FillGradesButtonPanel.setOpaque(false);
        PreviousButton = new JButton("Previous");
        PreviousButton.setBackground(new Color(0, 131, 112));
        PreviousButton.setForeground(Color.WHITE);
        PreviousButton.setFont(new Font("Segoe UI", Font.BOLD, 18));
        PreviousButton.setPreferredSize(new Dimension(110, 50));

        NextButton = new JButton("Next");
        NextButton.setBackground(new Color(0, 131, 112));
        NextButton.setForeground(Color.WHITE);
        NextButton.setFont(new Font("Segoe UI", Font.BOLD, 18));
        NextButton.setPreferredSize(new Dimension(110, 50));

        FillThisStudentButton = new JButton("Fill");
        FillThisStudentButton.setBackground(new Color(0, 131, 112));
        FillThisStudentButton.setForeground(Color.WHITE);
        FillThisStudentButton.setFont(new Font("Segoe UI", Font.BOLD, 18));
        FillThisStudentButton.setPreferredSize(new Dimension(110, 50));

        JButton finishButton = new JButton("Finish");
        finishButton.setBackground(new Color(0, 131, 112));
        finishButton.setForeground(Color.WHITE);
        finishButton.setFont(new Font("Segoe UI", Font.BOLD, 18));
        finishButton.setPreferredSize(new Dimension(110, 50));

        FillGradesButtonPanel.add(PreviousButton);
        FillGradesButtonPanel.add(FillThisStudentButton);
        FillGradesButtonPanel.add(NextButton);
        FillGradesButtonPanel.add(finishButton); // Adjust layout as needed

        fillingContentPanel.add(FillGradesButtonPanel);

// Wrap the content panel for centering
        JPanel fillingContentWrapper = new JPanel(new FlowLayout(FlowLayout.CENTER));
        fillingContentWrapper.setOpaque(false);
        fillingContentWrapper.add(fillingContentPanel);
        fillingGradeDetailsPanel.add(fillingContentWrapper, BorderLayout.CENTER);

        // Notes
        fillGradesNotesLabel = new JLabel("Notes ", SwingConstants.CENTER);
        fillGradesNotesLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
        fillingGradeDetailsPanel.add(fillGradesNotesLabel, BorderLayout.SOUTH);

        // Add both panels to the CardLayout
        center.add(fillGradesPanel, "fillGrades");
        center.add(fillingGradeDetailsPanel, "fillGradesDetails");

        // Action Listeners
        PreviousButton.addActionListener(e -> {
            CardLayout c2 = (CardLayout) center.getLayout();
            c2.show(center, "fillGradesDetails");
        });

        //  ***************   Action Listeners  *******************
        addStudent.addActionListener(new addStudentAction());
        removeStudent.addActionListener(new removeStudentAction());
        viewStudent.addActionListener(new viewStudentAction());
        addStudentBtn.addActionListener(new addStudentBtnAction());
        removeStudentBtn.addActionListener(new removeStudentBtnAction());
        searchStudent.addActionListener(new searchStudentBtnAction());
        editStudent.addActionListener(new editStudentBtnAction());
        saveStudent.addActionListener(new saveStudentBtnAction());
        addCourse.addActionListener(new addCourseAction());
        addCourseBtn.addActionListener(new addCourseBtnAction());
        removeCourse.addActionListener(new removeCourseAction());
        removeCourseBtn.addActionListener(new removeCourseBtnAction());
        viewCourse.addActionListener(new viewCourseAction());
        editCourseBtn.addActionListener(new ViewEditCourseBtnAction());
        saveCourseBtn.addActionListener(new ViewSaveCourseBtnAction());
        addInstructor.addActionListener(new addInstructorAction());
        addInstructorBtn.addActionListener(new addInstructorBtnAction());
        searchCourseBtn.addActionListener(new ViewSearchCourseBtnAction());
        online.addActionListener(new addOnlineAction());
        normal.addActionListener(new addNormalAction());
        moveStudentFromCourseToAnother.addActionListener(new moveStudentAction());
        moveStudentBtn.addActionListener(new MoveStudentBtnAction());
        removeStudentFromCourse.addActionListener(new removeStudentCourseAction());
        removeStudentCourseButton.addActionListener(new removeStudentFromCourseBtnAction());
        addStudentToCourse.addActionListener(new addStudentCourseAction());
        addStudentCourseButton.addActionListener(new AddStudentToCourseBtnAction());
        fillGrades.addActionListener(new FillGradesAction());
        FillGradesBtn.addActionListener(new FillGradesBtnAction());
        NextButton.addActionListener(new NextButtonAction());
        PreviousButton.addActionListener(new PreviousButtonAction());
        finishButton.addActionListener(new FinishButtonAction());
        finishButton.addActionListener(new FinishButtonAction());

    }

    public JPanel createStatCard(String title, int count, Color bgColor) {
        JPanel card = new JPanel(new BorderLayout());
        card.setBackground(bgColor);
        card.setBorder(new LineBorder(Color.DARK_GRAY, 2, true));

        JLabel titleLabel = new JLabel(title);
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setForeground(Color.WHITE);
        JLabel countLabel = new JLabel(String.valueOf(count));
        countLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        countLabel.setHorizontalAlignment(JLabel.CENTER);
        countLabel.setForeground(Color.WHITE);

        card.add(titleLabel, BorderLayout.NORTH);
        card.add(countLabel, BorderLayout.CENTER);
        card.setPreferredSize(new Dimension(200, 100));

        return card;
    }

    public static void main(String[] args) {
        AdminDashboard2 adminDashboard = new AdminDashboard2();
        adminDashboard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        adminDashboard.setSize(850, 630);
        adminDashboard.setLocationRelativeTo(null);
        adminDashboard.setVisible(true);
        // Add shutdown hook to save data
        adminDashboard.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                FileHandler.saveCourses(allCourses, "courses.dat");
                FileHandler.saveStudents(allStudents, "students.dat");
                FileHandler.saveInstructors(allInstructors, "instructors.dat");
            }
        });

    }

    public static ArrayList<Course> getAllCourses() {
        return allCourses;
    }

    public static void addCourse(Course course) {
        if (!allCourses.contains(course)) {
            allCourses.add(course);
        }
    }

    public static ArrayList<Student> getAllStudents() {
        return allStudents;
    }

    public void add_studentToUNi(Student s) {
        if (!(allStudents.contains(s))) {
            allStudents.add(s);
            Student.setTotalNbStudents(Student.getTotalNbStudents() + 1);

        } else {
            System.out.println(s.getName() + " is already registered!");
        }
    }

    public class addStudentAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            CardLayout cl = (CardLayout) center.getLayout();
            cl.show(center, "addStudent");

        }
    }

    public class removeStudentAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            CardLayout cl = (CardLayout) center.getLayout();
            cl.show(center, "removeStudent");
        }

    }

    public class viewStudentAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            CardLayout cl = (CardLayout) center.getLayout();
            cl.show(center, "viewStudent");
        }

    }

    public class addStudentBtnAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String nameAdd = enterName.getText().trim();
            String ageText = enterAge.getText().trim();
            String ssnText = enterSSN.getText().trim();
            String phoneNbAdd = enterPhoneNB.getText().trim();
            String addAddress = enterAddress.getText().trim();

            // Check if any field is empty
            if (nameAdd.isEmpty() || ageText.isEmpty() || ssnText.isEmpty()
                    || phoneNbAdd.isEmpty() || addAddress.isEmpty()) {
                addStudentNote.setText("Please fill in all fields.");
                addStudentNote.setForeground(Color.RED);
                return; // Exit early, don’t proceed
            }

            int ageAdd;
            int ssnAdd;

            try {
                ageAdd = Integer.parseInt(ageText);
                ssnAdd = Integer.parseInt(ssnText);
            } catch (NumberFormatException ex) {
                addStudentNote.setText("Age and SSN must be numbers.");
                addStudentNote.setForeground(Color.RED);
                return;
            }

            boolean alreadyExists = false;
            ArrayList<Student> students = allStudents;

            for (Student student : students) {
                if (student.getSsn() == ssnAdd) { // Prefer checking by unique SSN
                    alreadyExists = true;
                    System.out.println("Student with SSN: " + ssnText + " already exists!");
                    break;
                }
            }

            if (alreadyExists) {
                addStudentNote.setText("Student with SSN: " + ssnText + " already exists!");
                addStudentNote.setForeground(Color.RED);
            } else {
                Student newStudent = new Student(nameAdd, ageAdd, ssnAdd, addAddress, phoneNbAdd);
                allStudents.add(newStudent);
                addStudentNote.setText("Student added successfully!");
                addStudentNote.setForeground(new Color(0, 128, 0)); // Dark green
                System.out.println("Student added to the university: " + newStudent);
            }
        }
    }

    public class removeStudentBtnAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String idText = idToRemove.getText().trim();

            // Check if ID field is empty
            if (idText.isEmpty()) {
                removedNotes.setText("Please enter a student ID to remove.");
                removedNotes.setForeground(Color.RED);
                return;
            }

            int IDRemove;

            try {
                IDRemove = Integer.parseInt(idText);
            } catch (NumberFormatException ex) {
                removedNotes.setText("Invalid ID. Please enter a valid number.");
                removedNotes.setForeground(Color.RED);
                return;
            }

            ArrayList<Student> students = allStudents;
            boolean removed = false;

            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getID() == IDRemove) {
                    students.remove(i);
                    removed = true;
                    removedNotes.setText("Student removed successfully.");
                    removedNotes.setForeground(new Color(0, 128, 0)); // Dark green
                    System.out.println("Student removed from the university.");
                    break;
                }
            }

            if (!removed) {
                removedNotes.setText("No student found with ID: " + IDRemove);
                removedNotes.setForeground(Color.RED);
                System.out.println("No student found with ID: " + IDRemove);
            }
        }
    }

    public class searchStudentBtnAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String idText = viewID.getText().trim();

            // Check if ID field is empty
            if (idText.isEmpty()) {
                viewStudentNotes.setText("Please enter a student ID to search.");
                viewStudentNotes.setForeground(Color.RED);
                return;
            }

            int viewedID;

            try {
                viewedID = Integer.parseInt(idText);
            } catch (NumberFormatException ex) {
                viewStudentNotes.setText("Invalid ID. Please enter a valid number.");
                viewStudentNotes.setForeground(Color.RED);
                return;
            }

            ArrayList<Student> students = allStudents;
            boolean found = false;

            for (Student student : students) {
                if (student.getID() == viewedID) {
                    nameResult.setText(student.getName());
                    ssnResult.setText(String.valueOf(student.getSsn()));
                    phoneNBResult.setText(String.valueOf(student.getPhoneNb()));
                    addressResult.setText(student.getAddress());

                    found = true;
                    viewStudentNotes.setText("Student found.");
                    viewStudentNotes.setForeground(new Color(0, 128, 0));
                    break;
                }
            }

            if (!found) {
                nameResult.setText("");
                ssnResult.setText("");
                phoneNBResult.setText("");
                addressResult.setText("");
                viewStudentNotes.setText("No student found with ID: " + viewedID);
                viewStudentNotes.setForeground(Color.RED);
            }
        }
    }

    public class editStudentBtnAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            nameResult.setEditable(true);
            ssnResult.setEditable(true);
            phoneNBResult.setEditable(true);
            addressResult.setEditable(true);
        }
    }

    public class saveStudentBtnAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            nameResult.setEditable(false);
            ssnResult.setEditable(false);
            phoneNBResult.setEditable(false);
            addressResult.setEditable(false);

            String nameSave = nameResult.getText().trim();
            String ssnText = ssnResult.getText().trim();
            String phoneNbSave = phoneNBResult.getText().trim();
            String addressSave = addressResult.getText().trim();
            String idText = viewID.getText().trim();

            // Input validation
            if (idText.isEmpty() || ssnText.isEmpty() || nameSave.isEmpty()
                    || phoneNbSave.isEmpty() || addressSave.isEmpty()) {
                viewStudentNotes.setText("Please fill in all fields before saving.");
                viewStudentNotes.setForeground(Color.RED);
                return;
            }

            int idToSave;
            int ssnSave;

            try {
                idToSave = Integer.parseInt(idText);
                ssnSave = Integer.parseInt(ssnText);
            } catch (NumberFormatException ex) {
                viewStudentNotes.setText("Invalid ID or SSN. Please enter valid numbers.");
                viewStudentNotes.setForeground(Color.RED);
                return;
            }

            boolean found = false;
            for (Student student : allStudents) {
                if (student.getID() == idToSave) {
                    System.out.println("Found: " + student.toString());
                    student.setName(nameSave);
                    student.setSsn(ssnSave);
                    student.setPhoneNb(phoneNbSave);
                    student.setAddress(addressSave);
                    found = true;
                    System.out.println("Done editing: " + student.toString());
                    viewStudentNotes.setText("Student information saved successfully.");
                    viewStudentNotes.setForeground(new Color(0, 128, 0)); // Dark green
                    break;
                }
            }

            if (!found) {
                viewStudentNotes.setText("No student found with ID: " + idToSave);
                viewStudentNotes.setForeground(Color.RED);
                System.out.println("Not found");
            }
        }
    }

    public class addCourseAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            CardLayout cl = (CardLayout) center.getLayout();
            cl.show(center, "addCourse");

        }
    }

    public class addInstructorAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            CardLayout cl = (CardLayout) center.getLayout();
            cl.show(center, "addInstructor");

        }
    }

    public class addOnlineAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            enterNbWeeks.setEditable(true);
        }
    };

    public class addNormalAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            enterNbWeeks.setEditable(false);
        }
    };

    public class addCourseBtnAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String courseNameAdd = enterCourseName.getText().trim();
            String courseCodeAdd = enterCourseCode.getText().trim();
            String maxStudentsText = enterMaxNbStudents.getText().trim();
            String InstructorName = enterCourseInstructor.getText().trim();

            // Check for empty required fields
            if (courseNameAdd.isEmpty() || courseCodeAdd.isEmpty() || maxStudentsText.isEmpty() || InstructorName.isEmpty()) {
                courseNotes.setText("Please fill in all required fields.");
                courseNotes.setForeground(Color.RED);
                return;
            }

            int courseMaxNbStudentsAdd;
            try {
                courseMaxNbStudentsAdd = Integer.parseInt(maxStudentsText);
            } catch (NumberFormatException ex) {
                courseNotes.setText("Max number of students must be a valid number.");
                courseNotes.setForeground(Color.RED);
                return;
            }

            boolean alreadyExists = false;
            //check if already exist
            for (int i = 0; i < allCourses.size(); i++) {
                if (allCourses.get(i).getCode().equals(courseCodeAdd)) {
                    alreadyExists = true;
                    break;
                }
            }

            if (alreadyExists) {
                courseNotes.setText("Course already exists.");
                courseNotes.setForeground(Color.RED);
                System.out.println("Course already exists.");
            } else {
                boolean instructorFound = false;
                if (allInstructors.isEmpty()) {
                    System.out.println("No Instructors");
                    courseNotes.setText("No Instructors, Can't create course!");
                    courseNotes.setForeground(Color.RED);
                    return;
                }
                for (Instructor i : allInstructors) {
                    if (InstructorName.equals(i.getName())) {
                        instructorFound = true;

                        if (online.isSelected()) {
                            String nbWeeksText = enterNbWeeks.getText().trim();
                            if (nbWeeksText.isEmpty()) {
                                courseNotes.setText("Please enter number of weeks for online course.");
                                courseNotes.setForeground(Color.RED);
                                return;
                            }

                            int NbWeeksAdd;
                            try {
                                NbWeeksAdd = Integer.parseInt(nbWeeksText);
                            } catch (NumberFormatException ex) {
                                courseNotes.setText("Number of weeks must be a valid number.");
                                courseNotes.setForeground(Color.RED);
                                return;
                            }

                            OnlineCourseSection ocs = new OnlineCourseSection(NbWeeksAdd, courseNameAdd, courseCodeAdd, courseMaxNbStudentsAdd, i);
                            addCourse(ocs);
                            courseNotes.setText("Online course added successfully.");
                            courseNotes.setForeground(new Color(0, 128, 0));
                            System.out.println("Online course added successfully.");

                        } else if (normal.isSelected()) {
                            NormalCourseSection ncs = new NormalCourseSection(courseNameAdd, courseCodeAdd, courseMaxNbStudentsAdd, i);
                            addCourse(ncs);
                            courseNotes.setText("Normal course added successfully.");
                            courseNotes.setForeground(new Color(0, 128, 0));
                            System.out.println("Normal course added successfully.");
                        } else {
                            courseNotes.setText("Please select course type (Online or Normal).");
                            courseNotes.setForeground(Color.RED);
                        }

                    } else {
                        System.out.println("Instructor not found");
                        courseNotes.setText("Instructor " + InstructorName + " doesn't exist");
                        courseNotes.setForeground(Color.RED);

                    }

                }

            }

        }
    }

    public class removeCourseAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            CardLayout cl = (CardLayout) center.getLayout();
            cl.show(center, "removeCourse");

        }
    }

    public class removeCourseBtnAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String courseCodeRemove = enterCourseToRemove.getText().trim();

            if (courseCodeRemove.isEmpty()) {
                removeCourseNotes.setText("Please enter a course code to remove.");
                removeCourseNotes.setForeground(Color.RED);
                return;
            }

            boolean removed = false;

            for (int i = 0; i < allCourses.size(); i++) {
                if (allCourses.get(i).getCode().equalsIgnoreCase(courseCodeRemove)) {
                    allCourses.remove(i);
                    removed = true;
                    removeCourseNotes.setText("Course " + courseCodeRemove + " removed successfully.");
                    removeCourseNotes.setForeground(new Color(0, 128, 0));
                    System.out.println("The course " + courseCodeRemove + " has been removed.");
                    break;
                }
            }

            if (!removed) {
                removeCourseNotes.setText("No course found with code: " + courseCodeRemove);
                removeCourseNotes.setForeground(Color.RED);
                System.out.println("No course found with course code: " + courseCodeRemove);
            }
        }
    }

    public class viewCourseAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            CardLayout cl = (CardLayout) center.getLayout();
            cl.show(center, "viewCourse");
        }
    }

    public class ViewEditCourseBtnAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            courseNameField.setEditable(true);
            maxStudentsField.setEditable(true);
            typeField.setEditable(true);
        }
    }

    public class ViewSearchCourseBtnAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String searchCourseCode = viewCourseCodeField.getText().trim();

            if (searchCourseCode.isEmpty()) {
                viewCourseNotes.setText("Please enter a course code to search.");
                viewCourseNotes.setForeground(Color.RED);
                return;
            }

            boolean found = false;

            for (int i = 0; i < allCourses.size(); i++) {
                Course course = allCourses.get(i);

                if (course.getCode().equalsIgnoreCase(searchCourseCode)) {
                    courseNameField.setText(course.getName());
                    maxStudentsField.setText(String.valueOf(course.getMaxNbStudents()));
                    typeField.setText(course.type);
                    courseInstructorNameField.setText(course.getCourseInstructor().getName());

                    found = true;
                    viewCourseNotes.setText("Course found.");
                    viewCourseNotes.setForeground(new Color(0, 128, 0));
                    break;
                }
            }

            if (!found) {
                courseNameField.setText("");
                maxStudentsField.setText("");
                typeField.setText("");
                courseInstructorNameField.setText("");
                viewCourseNotes.setText("Course not found.");
                viewCourseNotes.setForeground(Color.RED);
            }
        }
    }

    public class ViewSaveCourseBtnAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String courseCode = viewCourseCodeField.getText();
            String newName = courseNameField.getText();
            int newMaxStudents = Integer.parseInt(maxStudentsField.getText());

            for (int i = 0; i < allCourses.size(); i++) {
                Course course = allCourses.get(i);

                if (course.getCode().equalsIgnoreCase(courseCode)) {
                    course.setName(newName);
                    course.setMaxNbStudents(newMaxStudents);
                    viewCourseNotes.setText("Changes saved!");
                    break;
                }
            }
            
            courseNameField.setEditable(false);
            maxStudentsField.setEditable(false);
            typeField.setEditable(false);
        }
    }

    public class addInstructorBtnAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String nameAdd = enterInstructoName.getText().trim();
            String ssnText = enterInstructorSSN.getText().trim();
            String phoneNbAdd = enterInstructorPhoneNB.getText().trim();
            String addressAdd = enterInstructorAddress.getText().trim();
            String ageText = enterInstructorAge.getText().trim();
            String MajorAdd = enterInstructorMajor.getText().trim();
            String DepartmentAdd = enterInstructorDepartment.getText().trim();

            // Check for empty fields
            if (nameAdd.isEmpty() || ssnText.isEmpty() || phoneNbAdd.isEmpty() || addressAdd.isEmpty()
                    || ageText.isEmpty() || MajorAdd.isEmpty() || DepartmentAdd.isEmpty()) {
                addInstructorNote.setText("Please fill in all fields.");
                addInstructorNote.setForeground(Color.RED);
                return;
            }

            int ssnAdd, ageAdd;

            try {
                ssnAdd = Integer.parseInt(ssnText);
                ageAdd = Integer.parseInt(ageText);
            } catch (NumberFormatException ex) {
                addInstructorNote.setText("SSN and Age must be valid numbers.");
                addInstructorNote.setForeground(Color.RED);
                return;
            }

            boolean alreadyExists = false;

            for (int i = 0; i < allInstructors.size(); i++) {
                if (allInstructors.get(i).getName().equalsIgnoreCase(nameAdd)) {
                    alreadyExists = true;
                    break;
                }
            }

            if (alreadyExists) {
                addInstructorNote.setText("Instructor already exists.");
                addInstructorNote.setForeground(Color.RED);
                System.out.println("Instructor already exists.");
            } else {
                Instructor newInstructor = new Instructor(MajorAdd, DepartmentAdd, nameAdd, ageAdd, ssnAdd, addressAdd, phoneNbAdd);
                allInstructors.add(newInstructor);
                addInstructorNote.setText("Instructor added successfully.");
                addInstructorNote.setForeground(new Color(0, 128, 0)); // Dark green
                System.out.println("Instructor added to the university.");
            }
        }
    }

    public class removeInstructorAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            CardLayout cl = (CardLayout) center.getLayout();
            cl.show(center, "removeInstructor");

        }
    }

    public class viewInstructorAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            CardLayout cl = (CardLayout) center.getLayout();
            cl.show(center, "viewInstructor");

        }
    }

    public class removeInstructorBtnAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String nameRemove = enterInstructorNameToRemove.getText().trim();

            // If name is empty
            if (nameRemove.isEmpty()) {
                removeInstructorNotes.setText("Please enter the instructor's name.");
                removeInstructorNotes.setForeground(Color.RED);
                System.out.println("Please enter the instructor's name.");
                return;
            }

            int indexFound = -1;
            boolean alreadyExists = false;

            // Search for the instructor
            for (int i = 0; i < allInstructors.size(); i++) {
                if (allInstructors.get(i).getName().equalsIgnoreCase(nameRemove)) {
                    indexFound = i;
                    alreadyExists = true;

                    Instructor instructorToRemove = allInstructors.get(i);

                    // Remove instructor from all courses
                    for (Course c : allCourses) {
                        if (c.getCourseInstructor().equals(instructorToRemove)) {
                            System.out.println("Found the instructor in course " + c.getCode());
                            c.setCourseInstructor(Course.TBA);
                            System.out.println("Instructor of " + c.getCode() + " removed and now is " + c.getCourseInstructor().getName());
                        }
                    }

                    allInstructors.remove(indexFound);

                    removeInstructorNotes.setText("Instructor has been removed.");
                    removeInstructorNotes.setForeground(new Color(0, 128, 0)); // Dark green
                    System.out.println("Instructor has been removed.");
                    break;
                }
            }

            if (!alreadyExists) {
                removeInstructorNotes.setText("No instructor found with name: " + nameRemove);
                removeInstructorNotes.setForeground(Color.RED);
                System.out.println("No instructor found with name: " + nameRemove);
            }
        }
    }

    public class searchInstructorBtnAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String SearchInstName = viewInstructorNameField.getText().trim();

            if (SearchInstName.isEmpty()) {
                viewInstructorNotes.setText("Please enter an instructor name to search.");
                viewInstructorNotes.setForeground(Color.RED);
                System.out.println("Please enter an instructor name to search.");
                return;
            }

            boolean found = false;

            for (int i = 0; i < allInstructors.size(); i++) {
                if (allInstructors.get(i).getName().equalsIgnoreCase(SearchInstName)) {

                    viewInstructorMajorResult.setText(allInstructors.get(i).getInstructorMajor());
                    viewInstructorSSNResult.setText(String.valueOf(allInstructors.get(i).getSsn()));
                    viewInstructorPhoneResult.setText(String.valueOf(allInstructors.get(i).getPhoneNb()));
                    viewInstructorAddressResult.setText(allInstructors.get(i).getAddress());
                    viewInstructorAgeResult.setText(String.valueOf(allInstructors.get(i).getAge()));
                    viewInstructorDeptResult.setText(allInstructors.get(i).getDepartment());

                    found = true;
                    viewInstructorNotes.setText("Instructor found.");
                    viewInstructorNotes.setForeground(new Color(0, 128, 0)); // Dark green
                    break;
                }
            }

            if (!found) {
                viewInstructorMajorResult.setText("");
                viewInstructorSSNResult.setText("");
                viewInstructorPhoneResult.setText("");
                viewInstructorAddressResult.setText("");
                viewInstructorAgeResult.setText("");
                viewInstructorDeptResult.setText("");

                viewInstructorNotes.setText("Instructor not found.");
                viewInstructorNotes.setForeground(Color.RED);
                System.out.println(SearchInstName + " is not found!");
            }
        }
    }

    public class ViewEditInstructorBtnAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            viewInstructorMajorResult.setEditable(true);
            viewInstructorSSNResult.setEditable(true);
            viewInstructorPhoneResult.setEditable(true);
            viewInstructorAddressResult.setEditable(true);
            viewInstructorAgeResult.setEditable(true);
            viewInstructorDeptResult.setEditable(true);

        }
    }

    public class saveInstructorBtnAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                viewInstructorMajorResult.setEditable(false);
                viewInstructorSSNResult.setEditable(false);
                viewInstructorPhoneResult.setEditable(false);
                viewInstructorAddressResult.setEditable(false);
                viewInstructorAgeResult.setEditable(false);
                viewInstructorDeptResult.setEditable(false);

                String NameMajorSave = viewInstructorNameField.getText().trim();
                String InstructorMajorSave = viewInstructorMajorResult.getText().trim();
                int InstructorAgeSave = Integer.parseInt(viewInstructorAgeResult.getText().trim());
                String InstructorDeptSave = viewInstructorDeptResult.getText().trim();
                int InstructorSsnSave = Integer.parseInt(viewInstructorSSNResult.getText().trim());
                String InstructorPhoneNbSave = viewInstructorPhoneResult.getText().trim();
                String InstructorAddressSave = viewInstructorAddressResult.getText().trim();
                Boolean exists = false;

                for (int i = 0; i < allInstructors.size(); i++) {
                    if (allInstructors.get(i).getName().equalsIgnoreCase(NameMajorSave)) {
                        allInstructors.get(i).setName(NameMajorSave);
                        allInstructors.get(i).setSsn(InstructorSsnSave);
                        allInstructors.get(i).setPhoneNb(InstructorPhoneNbSave);
                        allInstructors.get(i).setAddress(InstructorAddressSave);
                        allInstructors.get(i).setInstructorMajor(InstructorMajorSave);
                        allInstructors.get(i).setDepartment(InstructorDeptSave);
                        allInstructors.get(i).setAge(InstructorAgeSave);
                        exists = true;
                        break;
                    }
                }

                if (exists) {
                    System.out.println("The data are saved successfuly!");
                    viewInstructorNotes.setText("Instructor data saved successfully.");
                    viewInstructorNotes.setForeground(new Color(0, 128, 0)); // Dark green
                } else {
                    System.out.println("No instructor found with name " + NameMajorSave);
                    viewInstructorNotes.setText("No instructor found with name: " + NameMajorSave);
                    viewInstructorNotes.setForeground(Color.RED);
                }
            } catch (NumberFormatException ex) {
                System.out.println("Please enter valid numeric values for age and SSN.");
                viewInstructorNotes.setText("Invalid input: Age and SSN must be numbers.");
                viewInstructorNotes.setForeground(Color.RED);
            } catch (NullPointerException ex) {
                System.out.println("A required field is missing.");
                viewInstructorNotes.setText("Error: A required field is missing.");
                viewInstructorNotes.setForeground(Color.RED);
            }
        }
    }

    public class addStudentCourseAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            CardLayout cl = (CardLayout) center.getLayout();
            cl.show(center, "addStudentCourse");
        }
    }

    public class removeStudentCourseAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            CardLayout cl = (CardLayout) center.getLayout();
            cl.show(center, "removeStudentFromCourse");

        }
    }

    public class AddStudentToCourseBtnAction implements ActionListener {

        Course currentSection2;
        Course course2;

        @Override
        public void actionPerformed(ActionEvent e) {

            String studentIdText = studentInstructorIdField.getText();
            String courseCodeText = courseCodeFieldAddStudent.getText();

            int studentId;
            if (studentIdText.isEmpty() || courseCodeText.isEmpty()) {
                System.out.println("Please enter a valid student ID and a valid course code.");
                removeNotesLabel.setText("Fields cannot be empty.");
                removeNotesLabel.setForeground(Color.RED);
            }

            // Validate student ID input
            try {
                studentId = Integer.parseInt(studentIdText);
            } catch (NumberFormatException ex) {
                System.out.println("Please enter a valid numeric student ID.");
                notesLabel.setText("Invalid student ID. Enter a number.");
                notesLabel.setForeground(Color.RED);
                return;
            }

            // Find student by ID
            Student foundStudent = null;
            for (int i = 0; i < allStudents.size(); i++) {
                Student s = allStudents.get(i);
                if (s.getID() == studentId) {
                    foundStudent = s;
                    break;
                }
            }

            if (foundStudent == null) {
                System.out.println("Student not found.");
                notesLabel.setText("Student not found.");
                notesLabel.setForeground(Color.RED);
                return;
            }

            // Find course by code
            Course foundCourse = null;
            for (int i = 0; i < allCourses.size(); i++) {
                Course c = allCourses.get(i);
                if (c.getCode().equalsIgnoreCase(courseCodeText)) {
                    foundCourse = c;
                    break;
                }
            }

            if (foundCourse == null) {
                System.out.println("Course not found.");
                notesLabel.setText("Course not found.");
                notesLabel.setForeground(Color.RED);
                return;
            }

            // Check if course is a CourseSection and add student
            if (foundCourse instanceof CourseSection) {
                CourseSection courseSection = (CourseSection) foundCourse;

                if (((CourseSection) (foundCourse)).add_student(foundStudent)) {
                    System.out.println("Student added to course succefully.");
                    notesLabel.setText("Student added to course succefully.");
                    notesLabel.setForeground(new Color(0, 128, 0));
                } else {
                    System.out.println("Student already added.");
                    notesLabel.setText("Student already added OR section full.");
                    notesLabel.setForeground(Color.RED);
                }
            } else {
                System.out.println("Invalid course.");
                notesLabel.setText("Invalid course.");
                notesLabel.setForeground(Color.RED);
            }
        }
    }

    public class removeStudentFromCourseBtnAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String studentIdText = removeStudentIdField.getText();
            String courseCodeText = removeCourseCodeField.getText();

            int studentId;

            if (studentIdText.isEmpty() || courseCodeText.isEmpty()) {
                System.out.println("Fields cannot be empty.");
                removeNotesLabel.setText("Fields cannot be empty.");
                removeNotesLabel.setForeground(Color.RED);
                return;
            }
            // Validate student ID input
            try {
                studentId = Integer.parseInt(studentIdText);
            } catch (NumberFormatException ex) {
                System.out.println("Please enter a valid numeric student ID.");
                removeNotesLabel.setText("Invalid student ID. Enter a number.");
                removeNotesLabel.setForeground(Color.RED);
                return;
            }

            // Find student by ID
            Student foundStudent = null;
            for (int i = 0; i < allStudents.size(); i++) {
                Student s = allStudents.get(i);
                if (s.getID() == studentId) {
                    foundStudent = s;
                    break;
                }
            }

            if (foundStudent == null) {
                System.out.println("Student not found.");
                removeNotesLabel.setText("Student not found.");
                removeNotesLabel.setForeground(Color.RED);
                return;
            }

            // Find course by code
            Course foundCourse = null;
            for (int i = 0; i < allCourses.size(); i++) {
                Course c = allCourses.get(i);
                if (c.getCode().equalsIgnoreCase(courseCodeText)) {
                    foundCourse = c;
                    break;
                }
            }

            if (foundCourse == null) {
                System.out.println("Course not found.");
                removeNotesLabel.setText("Course not found.");
                removeNotesLabel.setForeground(Color.RED);
                return;
            }

            // Check if course is a CourseSection and remove student
            if (foundCourse instanceof CourseSection) {
                CourseSection courseSection = (CourseSection) foundCourse;
                if (courseSection.remove_student(foundStudent)) {
                    System.out.println("Student removed from course.");
                    removeNotesLabel.setText("Student removed from course.");
                    removeNotesLabel.setForeground(new Color(0, 128, 0));
                } else {
                    System.out.println("Student isn't registered in the course.");
                    removeNotesLabel.setText("Student isn't registered in the course.");
                    removeNotesLabel.setForeground(Color.RED);
                }

            } else {
                System.out.println("Selected course is not a course section.");
                removeNotesLabel.setText("Selected course is not a course section.");
                removeNotesLabel.setForeground(Color.RED);
            }
        }
    }

    public class moveStudentAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            CardLayout cl = (CardLayout) center.getLayout();
            cl.show(center, "moveStudent");

        }
    }

    public class MoveStudentBtnAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String studentIDStr = enterStudentIDToRemove.getText().trim();
            String fromCourseCode = enterInitialCourse.getText().trim();
            String toCourseCode = enterFinalCourse.getText().trim();

            if (studentIDStr.isEmpty() || fromCourseCode.isEmpty() || toCourseCode.isEmpty()) {
                moveStudentNotes.setText("Please fill all fields.");
                return;
            }

            int studentID;
            try {
                studentID = Integer.parseInt(studentIDStr);
            } catch (NumberFormatException ex) {
                moveStudentNotes.setText("Invalid Student ID.");
                return;
            }

            // Find the student by ID
            Student studentToMove = null;
            for (int i = 0; i < allStudents.size(); i++) {
                if (allStudents.get(i).getID() == studentID) {
                    studentToMove = allStudents.get(i);
                    break;
                }
            }

            if (studentToMove == null) {
                moveStudentNotes.setText("Student not found.");
                return;
            }

            // Find the "from" course
            CourseSection fromSection = null;
            for (int i = 0; i < allCourses.size(); i++) {
                Course course = allCourses.get(i);
                if (course.getCode().equalsIgnoreCase(fromCourseCode) && course instanceof CourseSection) {
                    fromSection = (CourseSection) course;
                    break;
                }
            }

            // Find the "to" course
            CourseSection toSection = null;
            for (int i = 0; i < allCourses.size(); i++) {
                Course course = allCourses.get(i);
                if (course.getCode().equalsIgnoreCase(toCourseCode) && course instanceof CourseSection) {
                    toSection = (CourseSection) course;
                    break;
                }
            }

            if (fromSection == null || toSection == null) {
                moveStudentNotes.setText("Invalid course code/s.");
                return;
            }
            if (fromSection.move_student(studentToMove, toSection)) {
                moveStudentNotes.setText("Student moved succefully.");

            } else {
                moveStudentNotes.setText("Invalid, student was not moved.");

            }
        }
    }

    //  ------------------   Fill Grades  -----------------------------
    public class FillGradesAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            CardLayout cl = (CardLayout) center.getLayout();
            cl.show(center, "fillGrades");

        }
    }

    int currentIndex = 0;
    ArrayList<Student> currentCourseStudents = new ArrayList<>();
    ArrayList<Double> currentCourseGrades = new ArrayList<>();
    CourseSection currentSection = null;

    public void showStudent(int index) {
        if (index >= 0 && index < currentCourseStudents.size()) {
            Student student = currentCourseStudents.get(index);
            studentNameToFillGrade.setText(student.getName());
            fillingGradeOfStudentText.setText(String.valueOf(currentCourseGrades.get(index)));
        }
    }

    public void enterGrades(int index) {
        try {
            double grade = Double.parseDouble(fillingGradeOfStudentText.getText());
            currentCourseGrades.set(index, grade);
        } catch (NumberFormatException ex) {
            FillGradesNotes.setText("Invalid grade input. Please enter a number.");
        }
    }

    public class FillGradesBtnAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            fillGradesNotesLabel.setText("Notes");
            fillGradesNotesLabel.setForeground(Color.black);
            System.out.println("Fill grades button clicked"); 

            String extractedCourseCode = enterCourseCodeToFill.getText().trim();
            System.out.println("Entered course code: " + extractedCourseCode); 

            if (extractedCourseCode.isEmpty()) {
                System.out.println("Empty course code entered"); 
                FillGradesNotes.setText("Enter a course code!");
                return;
            }

            boolean courseFound = false;
            boolean isCourseSection = false;

            System.out.println("Searching through " + allCourses.size() + " courses");
            for (Course course : allCourses) {
                if (course.getCode().equalsIgnoreCase(extractedCourseCode)) {
                    System.out.println("Course found: " + course.getCode());
                    courseFound = true;
                    if (course instanceof CourseSection) {
                        System.out.println("Course is a section");
                        isCourseSection = true;
                        currentSection = (CourseSection) course;
                        currentCourseStudents = currentSection.getCourseStudentsNames();
                        currentCourseGrades = currentSection.getCourseStudentsGrades();

                        System.out.println("Found " + currentCourseStudents.size() + " students"); 
                        if (currentCourseStudents.isEmpty()) {
                            System.out.println("No students in course"); 
                            FillGradesNotes.setText("No students registered in this course.");
                            return;
                        }
                        System.out.print("The registered in the course:  ");
                        for (Student s : currentCourseStudents) {
                            System.out.print(s.getName() + ", ");
                        }

                        currentIndex = 0;
                        showStudent(currentIndex);
                        System.out.println("Attempting to show fillGradesDetils screen");
                        CardLayout cl = (CardLayout) center.getLayout();
                        cl.show(center, "fillGradesDetails");
                        System.out.println("Should be on fillGradesDetils screen now");
                        return;
                    }
                    break;
                }
            }

            if (!courseFound) {
                System.out.println("Course not found in list"); 
                FillGradesNotes.setText("Course not found!");
            } else if (!isCourseSection) {
                System.out.println("Course found but not a section"); 
                FillGradesNotes.setText("Course is not a valid course section.");
            }
        }
    }

    private class NextButtonAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (currentIndex < currentCourseStudents.size() - 1) {
                enterGrades(currentIndex); // Save current grade
                currentIndex++;
                showStudent(currentIndex);
            }
        }
    }

    private class PreviousButtonAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (currentIndex > 0) {
                enterGrades(currentIndex);
                currentIndex--;
                showStudent(currentIndex);
            }
        }
    }

    private class FinishButtonAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // Save the current student's grade
            enterGrades(currentIndex);

            // Show confirmation message
            fillGradesNotesLabel.setText("All grades saved successfully.");
            fillGradesNotesLabel.setForeground(new Color(0, 128, 0)); // Dark green
            
        }
    }

}
