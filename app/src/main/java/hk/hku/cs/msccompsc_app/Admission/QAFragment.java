package hk.hku.cs.msccompsc_app.Admission;


import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import hk.hku.cs.msccompsc_app.R;


/**
 * A simple {@link androidx.fragment.app.Fragment} subclass.
 * Activities that contain this fragment must implement the

 */
public class QAFragment extends Fragment {

    private TextView mtextview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview =  inflater.inflate(R.layout.fragment_qa, container, false);
        mtextview = rootview.findViewById(R.id.qa_text);



        String htmltext = "\n" +
                "            <li class=\"lv1\">\n" +
                "                <div class=\"collapsible-header faq-admissions\"><strong>ADMISSIONS</strong></div>\n" +
                "                <div class=\"collapsible-body\">\n" +
                "                    <ul id=\"faq\" class=\"collapsible popout\" data-collapsible=\"accordion\">\n" +
                "                                <li class=\"lv2\">\n" +
                "                                    <div class=\"collapsible-header faq-admissions\"><i class=\"material-icons right\">question_answer</i><strong>1. I&#39;m an undergraduate student in the final year. Can I apply your programme?</strong></div>\n" +
                "                                    <div class=\"collapsible-body\">\n" +
                "                                        <div class=\"row\">\n" +
                "                                            <div class=\"col s12\">\n" +
                "                                                <p>You can submit application if you expect that you will complete your current study and obtain official certification on your graduation by August. Non-local students should however note that the official offer letter of admission could be issued only after you have submitted the official certificate on graduation and the complete transcript. This official offer letter is required for your student visa application which will take at least 6 to 8 weeks. Therefore, you may have to reserve enough time for visa application.</p>\n" +
                "                                            </div>\n" +
                "                                        </div>\n" +
                "                                    </div>\n" +
                "                                </li>\n" +
                "                                <li class=\"lv2\">\n" +
                "                                    <div class=\"collapsible-header faq-admissions\"><i class=\"material-icons right\">question_answer</i><strong>2. What supporting documents are required?</strong></div>\n" +
                "                                    <div class=\"collapsible-body\">\n" +
                "                                        <div class=\"row\">\n" +
                "                                            <div class=\"col s12\">\n" +
                "                                                <p>Along with the application the following documents are required to be submitted:</p>\n" +
                "<ol>\n" +
                "<li>Graduate transcript(s) with grading system of all tertiary level studies (or interim transcript if graduate transcript is not available yet)</li>\n" +
                "<li>Officially certified degree certificate(s), if available</li>\n" +
                "<li>English Language proficiency test score report, such as TOEFL or IELTS (only for applicants with qualifications from institutions outside HK where the language of instruction and/or examination is not English)</li>\n" +
                "<li>Proof of Cumulative Grade Point Average (CGPA) / average grade / average mark<br />If the transcript does not show the cumulative GPA / average grade / average mark, or no school proof is available, please complete calculation sheet (Please use this <a href=\"http://engg.hku.hk/faculty_msc/calsheet.xls\">template</a> to calculate the Cumulative Grade Point Average (CGPA) / average grade / average mark).</li>\n" +
                "<li>Official proof of class ranking, if available</li>\n" +
                "<li>A curriculum vitae (C.V.)</li>\n" +
                "</ol>\n" +
                "<p>Applicants are NOT required to submit original documents during the application stage. Should an applicant be given an admission offer by the Programme, he/she will receive notification of the need to submit original/certified true copy<span lang=\"en-us\">*</span> of the documents.</p>\n" +
                "<p>* The University will only ACCEPT originals or copies of the documents that have been duly declared as true copies before a notary public (e.g. a Commissioner for Oaths at a City District Office in Hong Kong). Copies of documents may be certified by the appropriate officials of your home institution if you are an overseas applicant. No photocopies will be accepted.</p>\n" +
                "<p>Please note that documents once submitted will not be returned, and will be destroyed if the application is unsuccessful.</p>\n" +
                "                                            </div>\n" +
                "                                        </div>\n" +
                "                                    </div>\n" +
                "                                </li>\n" +
                "                                <li class=\"lv2\">\n" +
                "                                    <div class=\"collapsible-header faq-admissions\"><i class=\"material-icons right\">question_answer</i><strong>3. Do I need to post the hardcopy of supporting doucments to HKU during application?</strong></div>\n" +
                "                                    <div class=\"collapsible-body\">\n" +
                "                                        <div class=\"row\">\n" +
                "                                            <div class=\"col s12\">\n" +
                "                                                <p><span>Applicants are recommended to provide the softcopy of all supporting documents, which can be uploaded to</span>&nbsp;the on-line application system within 4 weeks after account creation.</p>\n" +
                "<p><span>Applicants are NOT required to submit original documents during the application stage.</span></p>\n" +
                "<p><span>The chance of being admitted are the same even if only softcopy are provided.</span></p>\n" +
                "<p>Should an applicant be given an admission offer by the Programme, he/she will receive notification of the need to submit original/certified true copy of the documents.</p>\n" +
                "<p>Please note that documents once submitted will not be returned, and will be destroyed if the application is unsuccessful.</p>\n" +
                "                                            </div>\n" +
                "                                        </div>\n" +
                "                                    </div>\n" +
                "                                </li>\n" +
                "                                <li class=\"lv2\">\n" +
                "                                    <div class=\"collapsible-header faq-admissions\"><i class=\"material-icons right\">question_answer</i><strong>4. Are photocopies of the TOEFL or IELTS reports accepted?</strong></div>\n" +
                "                                    <div class=\"collapsible-body\">\n" +
                "                                        <div class=\"row\">\n" +
                "                                            <div class=\"col s12\">\n" +
                "                                                <p>Only original test reports are accepted. You could ask the test center to send the official reports directly to HKU.</p>\n" +
                "                                            </div>\n" +
                "                                        </div>\n" +
                "                                    </div>\n" +
                "                                </li>\n" +
                "                                <li class=\"lv2\">\n" +
                "                                    <div class=\"collapsible-header faq-admissions\"><i class=\"material-icons right\">question_answer</i><strong>5. Do I need to submit a C.V. or a personal statement?</strong></div>\n" +
                "                                    <div class=\"collapsible-body\">\n" +
                "                                        <div class=\"row\">\n" +
                "                                            <div class=\"col s12\">\n" +
                "                                                <p><span>Yes, you are required to submit a C.V. </span></p>\n" +
                "<p><span>Personal statement is optional.</span></p>\n" +
                "                                            </div>\n" +
                "                                        </div>\n" +
                "                                    </div>\n" +
                "                                </li>\n" +
                "                                <li class=\"lv2\">\n" +
                "                                    <div class=\"collapsible-header faq-admissions\"><i class=\"material-icons right\">question_answer</i><strong>6. Do I need to submit reference letters? Is there any form for referees?</strong></div>\n" +
                "                                    <div class=\"collapsible-body\">\n" +
                "                                        <div class=\"row\">\n" +
                "                                            <div class=\"col s12\">\n" +
                "                                                <p><span>If you are applying the China Postgraduate Scholarships for Computer Science, please refer to question 7 &amp; 8</span><span>. Otherwise, you do not need to submit reference letters or ask your referees to complete a form at the time of application. The Programme Office will contact you or the referees directly afterwards if reference letters are required.</span></p>\n" +
                "                                            </div>\n" +
                "                                        </div>\n" +
                "                                    </div>\n" +
                "                                </li>\n" +
                "                                <li class=\"lv2\">\n" +
                "                                    <div class=\"collapsible-header faq-admissions\"><i class=\"material-icons right\">question_answer</i><strong>7. I&#39;m an applicant from Mainland China. How do I apply the China Postgraduate Scholarships for Computer Science?</strong></div>\n" +
                "                                    <div class=\"collapsible-body\">\n" +
                "                                        <div class=\"row\">\n" +
                "                                            <div class=\"col s12\">\n" +
                "                                                <p><span>Application for the Scholarship has to be made together with the application for admission. You need to indicate on the online application system and submit the scholarship application form and the confidential statement from referee by the deadline which is the same as that of admission. The form can be downloaded from the online application system as supporting documents. Any application forms received after the admission result is announced will not be considered.</span></p>\n" +
                "                                            </div>\n" +
                "                                        </div>\n" +
                "                                    </div>\n" +
                "                                </li>\n" +
                "                                <li class=\"lv2\">\n" +
                "                                    <div class=\"collapsible-header faq-admissions\"><i class=\"material-icons right\">question_answer</i><strong>8. How many confidential statements from referee are required if I apply the China Postgraduate Scholarships?</strong></div>\n" +
                "                                    <div class=\"collapsible-body\">\n" +
                "                                        <div class=\"row\">\n" +
                "                                            <div class=\"col s12\">\n" +
                "                                                <p>One confidential statement from referee is required. You can download the form from the online application system.</p>\n" +
                "                                            </div>\n" +
                "                                        </div>\n" +
                "                                    </div>\n" +
                "                                </li>\n" +
                "                                <li class=\"lv2\">\n" +
                "                                    <div class=\"collapsible-header faq-admissions\"><i class=\"material-icons right\">question_answer</i><strong>9. When will I know the application results?</strong></div>\n" +
                "                                    <div class=\"collapsible-body\">\n" +
                "                                        <div class=\"row\">\n" +
                "                                            <div class=\"col s12\">\n" +
                "                                                <p>The admission selection committee works continuously for months to review the large number of applications and to conduct interviews in order to select top candidates for admission to this MSc programme.</p>\n" +
                "<p>Successful applicants will be notified of the result&nbsp;once it is ready.</p>\n" +
                "<p>However, if you have not heard from us by 31 July 2019, you may assume that your application is not successful.</p>\n" +
                "                                            </div>\n" +
                "                                        </div>\n" +
                "                                    </div>\n" +
                "                                </li>\n" +
                "                    </ul>\n" +
                "                </div>\n" +
                "            </li>\n" +
                "            <li class=\"lv1\">\n" +
                "                <div class=\"collapsible-header faq-visa-related-non-local-applicants\"><strong>VISA RELATED (NON-LOCAL APPLICANTS)</strong></div>\n" +
                "                <div class=\"collapsible-body\">\n" +
                "                    <ul id=\"faq\" class=\"collapsible popout\" data-collapsible=\"accordion\">\n" +
                "                                <li class=\"lv2\">\n" +
                "                                    <div class=\"collapsible-header faq-visa-related-non-local-applicants\"><i class=\"material-icons right\">question_answer</i><strong>1. How to apply for the student visa?</strong></div>\n" +
                "                                    <div class=\"collapsible-body\">\n" +
                "                                        <div class=\"row\">\n" +
                "                                            <div class=\"col s12\">\n" +
                "                                                <p>Non-local students, including those from the Mainland China, must obtain a visa in order to study in Hong Kong. Without a valid visa, they cannot register for their study in the University. The student visa will also enable students to enter Hong Kong as students.</p>\n" +
                "<p>The application procedures for a student visa to Hong Kong are available on the Centre of Development and Resources for Students (CEDARS) website at <a href=\"http://cedars.hku.hk/\" target=\"_blank\">http://cedars.hku.hk</a></p>\n" +
                "<p>All applicants for a student visa to HKSAR are required to have a local sponsor. Students* coming to HKU should nominate CEDARS to be their visa sponsor by completing and returning to CEDARS an application form for visa sponsorship with all the required documents and payment.</p>\n" +
                "<p>* Mainland China students enrolled in taught postgraduate programme, should apply to the China Affairs Office &lt;<a href=\"http://www.als.hku.hk/hkucao/svapp_e.php\" target=\"_blank\">http://www.als.hku.hk/hkucao/svapp_e.php/</a>&gt; for visa sponsorship.</p>\n" +
                "<p>All non-Hong Kong students who intend to stay for more than 6 months should obtain a Hong Kong Identity Card after their arrival.</p>\n" +
                "                                            </div>\n" +
                "                                        </div>\n" +
                "                                    </div>\n" +
                "                                </li>\n" +
                "                                <li class=\"lv2\">\n" +
                "                                    <div class=\"collapsible-header faq-visa-related-non-local-applicants\"><i class=\"material-icons right\">question_answer</i><strong>2. I&#39;m a non-local applicant. How do I get information about student visa, finance, accommodation and life in HKU?</strong></div>\n" +
                "                                    <div class=\"collapsible-body\">\n" +
                "                                        <div class=\"row\">\n" +
                "                                            <div class=\"col s12\">\n" +
                "                                                <p></p>\n" +
                "<ul>\n" +
                "<li>\n" +
                "<div>Composition fees of MSc(CompSc):&nbsp;<a href=\"https://www.msc-cs.hku.hk/Admission/Fees\">https://www.msc-cs.hku.hk/Admission/Fees</a></div>\n" +
                "</li>\n" +
                "<li>\n" +
                "<div>Support to Non-local Applicants: <a target=\"_blank\" href=\"https://engg.hku.hk/faculty_msc/non-local.htm\">https://engg.hku.hk/faculty_msc/non-local.htm</a> (information provided by the <a target=\"_blank\" href=\"https://engg.hku.hk/\">Faculty of Engineering</a>)</div>\n" +
                "</li>\n" +
                "<li>\n" +
                "<div>Support for Non-local Students: <a target=\"_blank\" href=\"http://cedars.hku.hk/sections/SupportIntl.php\">http://cedars.hku.hk/sections/SupportIntl.php</a> (information provided by the <a target=\"_blank\" href=\"http://cedars.hku.hk/\">Centre of Development and Resources for Students</a>)</div>\n" +
                "</li>\n" +
                "<li>\n" +
                "<div>HKU Preparatory Guide for Non-local Students: <a target=\"_blank\" href=\"https://www.cedars.hku.hk/nonlocal/publication/prepguide1718.pdf\">https://www.cedars.hku.hk/nonlocal/publication/prepguide1718.pdf</a>(information provided by the <a target=\"_blank\" href=\"http://cedars.hku.hk/\">Centre of Development and Resources for Students</a></div>\n" +
                "</li>\n" +
                "</ul>\n" +
                "<p></p>\n" +
                "                                            </div>\n" +
                "                                        </div>\n" +
                "                                    </div>\n" +
                "                                </li>\n" +
                "                                <li class=\"lv2\">\n" +
                "                                    <div class=\"collapsible-header faq-visa-related-non-local-applicants\"><i class=\"material-icons right\">question_answer</i><strong>3. If I have a valid work visa or tourist visa, do I need a student visa for studying in Hong Kong?</strong></div>\n" +
                "                                    <div class=\"collapsible-body\">\n" +
                "                                        <div class=\"row\">\n" +
                "                                            <div class=\"col s12\">\n" +
                "                                                <p>Holder of Work Visa</p>\n" +
                "<p>- If you have a valid work visa for Hong Kong that covers the programme period, you will not need another visa to study in the <strong>part-time</strong> MSc Programme.</p>\n" +
                "<p></p>\n" +
                "<p>Holder of Tourist Visa</p>\n" +
                "<p>- Tourist visa does not allow you to study in&nbsp;Hong Kong.&nbsp;&nbsp;Students who do not have the right to abode in Hong Kong are required to apply for a student visa for entering into Hong Kong and studying on a <strong>full-time</strong> master degree programme.</p>\n" +
                "                                            </div>\n" +
                "                                        </div>\n" +
                "                                    </div>\n" +
                "                                </li>\n" +
                "                                <li class=\"lv2\">\n" +
                "                                    <div class=\"collapsible-header faq-visa-related-non-local-applicants\"><i class=\"material-icons right\">question_answer</i><strong>4. Can I work in Hong Kong if I am holding a student visa?</strong></div>\n" +
                "                                    <div class=\"collapsible-body\">\n" +
                "                                        <div class=\"row\">\n" +
                "                                            <div class=\"col s12\">\n" +
                "                                                <p>In principle, Faculty of Engineering of the University of Hong Kong does not support any work outside HKU undertaken by non-local TPG students entering Hong Kong with student visa.</p>\n" +
                "<p>Yet, the visa/entry permit should normally have the indication by the Director of Immigration on no objection for taking up study/curriculum related internship endorsed by the University for up to one-third of the duration of the programme as long as the person remains studying in the University and the limit of stay in Hong Kong remains unexpired.</p>\n" +
                "<p>Non-local full-time students may take up part-time on-campus employment for not more than 20 hours per week throughout the year and summer jobs during the summer months (i.e. 1 June to 31 August) without any limit in relation to working hours and location.</p>\n" +
                "<p>The Faculty of Engineering has further guidelines regulating non-local full-time TPG students for internship and work. &nbsp;The Faculty does not object to the full-time non-local students to undertake internship or work during summer in or outside Hong Kong only on the following conditions:</p>\n" +
                "<ul>\n" +
                "<li>the student has not graduated;</li>\n" +
                "<li>the student has not enrolled in any course(s) in the summer semester;</li>\n" +
                "<li>the student does not have an incomplete project/dissertation in the TPG programme; and</li>\n" +
                "<li>the work is related to the field of study.</li>\n" +
                "</ul>\n" +
                "<p>Please refer to the detailed information under \"Employment during the Study Programme\" of the webpage of HKSAR Immigration Department at:&nbsp;<a href=\"http://www.immd.gov.hk/eng/faq/imm-policy-study.html\" target=\"_blank\">http://www.immd.gov.hk/eng/faq/imm-policy-study.html</a></p>\n" +
                "                                            </div>\n" +
                "                                        </div>\n" +
                "                                    </div>\n" +
                "                                </li>\n" +
                "                    </ul>\n" +
                "                </div>\n" +
                "            </li>\n" +
                "\n" +
                "</ul>\n" +
                "\n" +
                "\n";


        mtextview.setText(Html.fromHtml(htmltext));

        return rootview;
    }


}