package au.edu.tafesa.itstudies.studentstudyplan;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import au.edu.tafesa.itstudies.studentstudyplan.dao.StudentStudyPlanDetailsDAO;
public class InformationPage extends Activity {
    public static StudentStudyPlanDetailsDAO studentStudyPlanDetailsDAO;
       String studentID="000868858";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_page);
        ArrayList<HashMap> maps = new ArrayList<HashMap>();

      //  studentStudyPlanDetailsDAO.open();
        maps =  studentStudyPlanDetailsDAO.getRawStudentStudyPlanDetailsDAO(studentID);

        TextView txtResult = findViewById(R.id.textView);
     //   txtResult.setText(Arrays.toString(maps);
    }

}
