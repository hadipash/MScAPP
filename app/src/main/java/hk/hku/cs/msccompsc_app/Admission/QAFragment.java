package hk.hku.cs.msccompsc_app.Admission;


import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.TextView;


import hk.hku.cs.msccompsc_app.R;


/**
 * A simple {@link androidx.fragment.app.Fragment} subclass.
 * Activities that contain this fragment must implement the

 */
public class QAFragment extends Fragment {

    private static final String TAG = "NormalExpandActivity";
    private ExpandableListView mExpandableListView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview =  inflater.inflate(R.layout.fragment_qa, container, false);

        mExpandableListView = (ExpandableListView) rootview.findViewById(R.id.expandable_list);
        final NormalExpandableListAdapter adapter = new NormalExpandableListAdapter(Term, Explanation);
        mExpandableListView.setAdapter(adapter);
        adapter.setOnGroupExpandedListener(new OnGroupExpandedListener() {
            @Override
            public void onGroupExpanded(int groupPosition) {
                expandOnlyOne(groupPosition);
            }
        });

        //  设置分组项的点击监听事件
        mExpandableListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
                Log.d(TAG, "onGroupClick: groupPosition:" + groupPosition + ", id:" + id);
                return false;
            }
        });
        return rootview;
    }

    // 每次展开一个分组后，关闭其他的分组
    public boolean expandOnlyOne(int expandedPosition) {
        boolean result = true;
        int groupLength = mExpandableListView.getExpandableListAdapter().getGroupCount();
        for (int i = 0; i < groupLength; i++) {
            if (i != expandedPosition && mExpandableListView.isGroupExpanded(i)) {
                result &= mExpandableListView.collapseGroup(i);
            }
        }
        return result;
    }

    private static String[] Term = {
            "1. I'm an undergraduate student in the final year. Can I apply your programme?",
            "2. What supporting documents are required?",
            "3. Do I need to post the hardcopy of supporting doucments to HKU during application?",
            "4. Are photocopies of the TOEFL or IELTS reports accepted?",
            "5. Do I need to submit a C.V. or a personal statement?",
            "6. Do I need to submit reference letters? Is there any form for referees?",
            "7. I'm an applicant from Mainland China. How do I apply the China Postgraduate Scholarships for Computer Science?",
            "8. How many confidential statements from referee are required if I apply the China Postgraduate Scholarships?"};
    private static String[][] Explanation = {
            {"You can submit application if you expect that you will complete your current study and obtain official certification on your graduation by August. Non-local students should however note that the official offer letter of admission could be issued only after you have submitted the official certificate on graduation and the complete transcript. This official offer letter is required for your student visa application which will take at least 6 to 8 weeks. Therefore, you may have to reserve enough time for visa application."},
            {"Along with the application the following documents are required to be submitted:\n" +
                    "\n" +
                    "1. Graduate transcript(s) with grading system of all tertiary level studies (or interim transcript if graduate transcript is not available yet)\n\n" +
                    "2. Officially certified degree certificate(s), if available\n\n" +
                    "3. English Language proficiency test score report, such as TOEFL or IELTS (only for applicants with qualifications from institutions outside HK where the language of instruction and/or examination is not English)\n\n" +
                    "4. Proof of Cumulative Grade Point Average (CGPA) / average grade / average mark\n\n" +
                    "5. If the transcript does not show the cumulative GPA / average grade / average mark, or no school proof is available, please complete calculation sheet (Please use this template to calculate the Cumulative Grade Point Average (CGPA) / average grade / average mark).\n\n" +
                    "6. Official proof of class ranking, if available\n\n" +
                    "7. A curriculum vitae (C.V.)\n\n" +
                    "Applicants are NOT required to submit original documents during the application stage. Should an applicant be given an admission offer by the Programme, he/she will receive notification of the need to submit original/certified true copy* of the documents.\n" +
                    "\n\n" +
                    "* The University will only ACCEPT originals or copies of the documents that have been duly declared as true copies before a notary public (e.g. a Commissioner for Oaths at a City District Office in Hong Kong). Copies of documents may be certified by the appropriate officials of your home institution if you are an overseas applicant. No photocopies will be accepted.\n" +
                    "\n\n" +
                    "Please note that documents once submitted will not be returned, and will be destroyed if the application is unsuccessful."},
            {"Applicants are recommended to provide the softcopy of all supporting documents, which can be uploaded to the on-line application system within 4 weeks after account creation.\n" +
                    "\n" +
                    "Applicants are NOT required to submit original documents during the application stage.\n" +
                    "\n" +
                    "The chance of being admitted are the same even if only softcopy are provided.\n" +
                    "\n" +
                    "Should an applicant be given an admission offer by the Programme, he/she will receive notification of the need to submit original/certified true copy of the documents.\n" +
                    "\n" +
                    "Please note that documents once submitted will not be returned, and will be destroyed if the application is unsuccessful."},
            {"Only original test reports are accepted. You could ask the test center to send the official reports directly to HKU."},
            {"Yes, you are required to submit a C.V.\n" +
                    "\n" +
                    "Personal statement is optional."},
            {"If you are applying the China Postgraduate Scholarships for Computer Science, please refer to question 7 & 8. Otherwise, you do not need to submit reference letters or ask your referees to complete a form at the time of application. The Programme Office will contact you or the referees directly afterwards if reference letters are required."},
            {"Application for the Scholarship has to be made together with the application for admission. You need to indicate on the online application system and submit the scholarship application form and the confidential statement from referee by the deadline which is the same as that of admission. The form can be downloaded from the online application system as supporting documents. Any application forms received after the admission result is announced will not be considered."},
            {"One confidential statement from referee is required. You can download the form from the online application system."}
    };
}