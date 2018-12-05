package hk.hku.cs.msccompsc_app.Admission;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import hk.hku.cs.msccompsc_app.About.FacultyAdapter;
import hk.hku.cs.msccompsc_app.R;


/**
 * A simple {@link androidx.fragment.app.Fragment} subclass.
 * Activities that contain this fragment must implement the

 */
public class WordsFragment extends Fragment {

    private TextView mtextview;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview =  inflater.inflate(R.layout.fragment_words, container, false);
        mtextview = rootview.findViewById(R.id.words_text);

        String htmltext =
                "<p>When you enrol in the MSc(CompSc) Programme, you gain all the advantages of a famous university with an outstanding reputation. When you leave our Programme, you will have a solid foundation in the theoretical aspect of computer science, together with hands-on technical experience in information technology, to help you begin a rewarding career.</p>\n" +
                "<p>But a master&rsquo;s programme does not have to be the last chapter of your learning merely technical, hard-core information technology; it can serve as a springboard to other career opportunities and learning challenges. For example, many of our graduates who find themselves moving into management, may continue their studies towards an MBA degree, while others may go on to doctoral studies here at HKU or elsewhere.</p>\n" +
                "<p>Some of our students and graduates would also like to share their experience with you.</p>\n" +
                "\n" ;
        mtextview.setText(Html.fromHtml(htmltext));

        mRecyclerView = rootview.findViewById(R.id.student_recycle_view);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new GridLayoutManager(rootview.getContext(),3);
        mRecyclerView.setLayoutManager(mLayoutManager);

        if (isAdded()) {
            Bitmap[] image = {
                    BitmapFactory.decodeResource(getResources(), R.mipmap.stud_clark),
                    BitmapFactory.decodeResource(getResources(), R.mipmap.stud_yitong),
                    BitmapFactory.decodeResource(getResources(), R.mipmap.stud_bruce),
                    BitmapFactory.decodeResource(getResources(), R.mipmap.stud_lee_lip),
                    BitmapFactory.decodeResource(getResources(), R.mipmap.stud_philip_lee),
                    BitmapFactory.decodeResource(getResources(), R.mipmap.stud_lengsiyu),
                    BitmapFactory.decodeResource(getResources(), R.mipmap.stud_xingchi),
                    BitmapFactory.decodeResource(getResources(), R.mipmap.stud_tony_ngan),
                    BitmapFactory.decodeResource(getResources(), R.mipmap.stud_stoffregen),
                    BitmapFactory.decodeResource(getResources(), R.mipmap.stud_vidyantiningrum)
            };


            String[] names = {
                    "Mr. Clark Matthew William", "Miss Cui Yitong","Mr. Hu Tianyi","Mr. Lee Lip Tong","Mr. Lee Tin Yun",
                    "Mr. Leng Siyu","Mr. Liang Xingchi", "Mr. Ngan Wai Kong","Mr. Stoffregen Florian","Miss Vidyantiningrum Karina"
            };
            String[] intro = {
                    "After studying and working for several years in the United States, I chose to do my Master's degree at HKU based on the sterling reputation that the University and the CS programme have around the world. Having the flexibility to design my own studies and select interesting courses as well as having the opportunity to learn from top professors really appealed to me. The coursework was challenging yet fulfilling, and topics were relevant for today's fast-changing world. I have been able to work with cutting-edge robotic systems during my dissertation project, and I am excited to begin a new career in the technology field armed with my MSc from HKU.",
                    "Studying in HKU MSc(CompSc) has prepared me for success in a couple of ways.  First, MSc(CompSc) offers a range of courses tailored to meet the specific academic and professional goals of each student.  Most of the hot topics are involved, such as Machine Learning, Data Mining, Deep Learning, Cloud Computing, Blockchain technology, etc.  When I do job-hunting, I find the courses have really offered help to me down-to-earth.  The programme also gives me much resources of knowledge and job opportunities.  Second, the strict requirements of each course induce me to be hard-working all the time, and provide me with many advanced learning skills.  The teamwork tasks gave me opportunity to know more about my classmates, who are down-to-earth and humble.\n" +
                            "\n" +
                            "Countless sleepless nights in HKU MSc(CompSc)  made me a better person.  It was an incredible experience that I don't think I could have anywhere else.",
                    "In the past year, I benefit a lot from tough courses in this program, which makes up my deficiency in coding experience and brings me edge-cutting knowledge. Meanwhile, the design of four streams helps me concentrate on the study of computational finance. Comparing with programs in other universities, I think numerous opportunities provided by this program is a great advantage. Some teachers are from teaching staff with strong research experience while others are from industry with enrich working experience, meaning that communicating with them positively can bring us extra benefits. Furthermore, thanks to the reputation of the University of Hong Kong, we have access to many competitions, one of which is Rotman International Trading Competition held in Toronto competing with other top universities among the world. Through those competitions, I make friends with experienced algo traders and they also teach me much beyond the book, which enhance my will to work in this industry. \n" +
                            "\n" +
                            " \n" +
                            "\n" +
                            "All in all, this program is really fruitful, and students from different background can get what they want. But the study period is short, I think designing the study plan on first day is important and necessary. Just be open and outgoing, the precious opportunity is around us.",
                    "There are a wide range of courses to choose from - AI, cybersecurity and financial computing to name a few. The course contents are up to date and HKU provides quality resources so that the learning process is smooth and unhindered.  The best part about the MSc programme is perhaps the people that you meet - I’ve made many friends with similar interest and drive.  We also have down-to-earth professors who are willing to dedicate time and effort to introduce current concepts and topics relevant to the industry.  On top of having a rigorous and well laid out curriculum, studying at HKU gives me an enjoyable and dynamic student life.  I am able to easily meet people entering or already working in the tech industry and I’m also able to practice and learn both Cantonese and Mandarin due to the diversity of students.  Lastly, Hong Kong provides a fun and safe place to study and is ideally located to immerse oneself into what is perhaps the world’s largest and most sophisticated mecca of technology - the Greater Bay Area.\"",
                    "Read Financial Times in mid-August this year and you will see the new trend in the hedge fund world - DIY algo traders. The emerging new platforms, say Quantiacs, allow the tech talent to show off and get money at home without working in hedge funds. However, regardless of being a full-time or a part-time DIY trader, you need to have strong knowledge in both finance and computer science. In addition to courses in computer science, HKU MSc(CompSc) offers a range of courses with duo-foci on both areas of knowledge. My study in HKU MSc(CompSc) benefits me a lot and greatly prepares me for catching the new trend. I strongly recommend others having the same goal apply to this programme.",
                    "One of appealing aspects this programme brings is the incredible opportunities. First, it offers excellent courses on different subjects including information security, cloud computing, computation finance, etc. The flexibility allows students to effectively pursue their beloved objects. Second, it offers the chance to make friends with talented people from all over the world. The communication and teamwork experience essentially result in insight sharing, mutual improvement and a lot of fun. Third, it offers abundant resources. For example, students are able to enjoy the journey of intelligence through library system, physically and electronically, and look for interesting jobs from various companies through the NETjobs system.",
                    "I started from scratch to build my financial block when I come to HKU to take the first financial-computing-stream course.  Its starting point is pretty friendly to a finance freshman and enables me to follow up smoothly. One-year hard work later, I found that I have a good grasp of computer science and financial area and therefore obtain many summer internship offers from Hong Kong financial institutions.  If you are eager to dive into the FinTech subject, MSc(CompSc) programme (financial computing stream) is exactly your best option.",
                    "Looking back the past one and half year studying in HKU MSc(CompSc), a new door was definitely opened for me to work on emerged robotics and drone system. Allowing me to explore new opportunities in learning, collaborating with those talented people and stepping into the road of entrepreneurship. Having a highly flexible curriculum helps me to strengthen on both theoretical and practical side, cultivates me an open mind and motivates me to get good preparation to a world full of challenges.",
                    "The University of Hong Kong (HKU) provides students with the opportunity to tailor their courses of study to fit their future career motivations. This significant deviation from standard programmes enables the future graduates to strengthen their talents and have a smooth transition into the business world.\n" +
                            "\n" +
                            "Furthermore, the HKU Professors strive to teach only up to date and current concepts, never missing the chance to give advice in order to guarantee that their students will be able to provide sophisticated solutions at the end of each course.\n" +
                            "\n" +
                            "As a testament to its quality, dozens of high ranking leaders of industry and scientific institutions worldwide visit HKU to offer their time to answer questions from students in person each year. This outstanding opportunity lets students broaden their horizon and extend their business network on a highly qualitative level.\n" +
                            "\n" +
                            "My already high expectations of the MSc(Computer Science) Information Security study programme were greatly exceeded. I am very thankful for having the chance to undertake my master degree at HKU and honored to study side by side with so many young talents from across the globe.",
                    "I have always had a strong interest in Fintech.  With Hong Kong being the global financial hub of Asia, gaining finance-related expertise here is always an aspiration of mine.  I was very excited when I came across MSc in Computer Science programme at HKU.  Not only does the Programme offer a lot of interesting courses in IT, it also provides a stream of my interest: Financial Computing stream.  Throughout the course of my study, I was exposed to courses which not only are useful in the field of Fintech but also introduce very relevant knowledge to recent industries’ needs.  The faculty members whom I was taught and supervised by were knowledgeable and resourceful.  They could explain very complex information in ways students can easily understand.  It was a very motivating experience to learn first-hand from these industries experts.  HKU also constantly gave us opportunities to attend seminars and talks and encouraged us to join competitions to increase our competitiveness and exposure to the outside world.  This Programme also let me work on a dissertation project.  I believe that dissertation provides a very good opportunity to showcase my interests and knowledge into a single portfolio.  I chose a topic and materials that strongly resonate with my aspiration.  Not only did I feel accomplished after completing it, but it is also one of the first items on my resume that appeal to potential employers.",


            };
            mAdapter = new StudentAdapter(image, names, intro);
            mRecyclerView.setAdapter(mAdapter);

        }

        return rootview;
    }


}