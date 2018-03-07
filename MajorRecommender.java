import java.util.Scanner;
public class MajorRecommender {
	String majorMessage;
	String recommendedMajors;
	int interestLevel;
	String Survey;

//Constructor
MajorRecommender(){
majorMessage=null;
recommendedMajors=null;
interestLevel=0;
}

public static void main(String[] args) {

Scanner input=new Scanner(System.in);

String survey;
String questionOne;
String questionTwo;
String questionThree;
String questionFour;
String questionFive;
String questionSix;
String questionSeven;
String questionEight;
String questionNine;
String questionTen;
String questionEleven;
String questionTwelve;
String questionThirteen;
String questionFourteen;
String questionFifteen;
String questionSixteen;
String questionSeventeen;
String questionEighteen;
String questionNineteen;
String questionTwenty;
String questionTwentyOne;
String questionTwentyTwo;
String questionTwentyThree;
String questionTwentyFour;

//Survey workaround

System.out.println("Hello Current or Future WVU student, are you interested in taking a survey that reccomends majors that might interest you?\nPlease input yes or no.");
survey=input.nextLine();

if (survey.equalsIgnoreCase("no")) {
System.out.println("Okay User, no survey will be conducted.\nIf you change your mind run the program again and select yes.");
	System.exit(0); }
else {

//BotCategorization

MajorRecommender businessBot= new MajorRecommender();
businessBot.majorMessage="From your answers, I have seen an interest in the field of Business and Education.";
businessBot.recommendedMajors="Accounting, Communications, Economics, Education, Entrerpreneurship and Innovation, Finace,\nGlobal Supply Chain Managment, Hospitality and Tourism Managment, Management, and Marketing.\n ";

MajorRecommender artBot= new MajorRecommender();
artBot.majorMessage="From your answers, I have seen an interest in the field of arts and music.";
artBot.recommendedMajors="Acting, Art History, Art Education, Ceramics, Design Studios, Graphic Design, Music, One of Many Musical Performance Majors,\nMusic Compisition, Music Theatre, Music Education, Music Therapy, Sculpture, Dance, Fashion, Interior Design, Painting, Photography, \nPuppetry, and Theatre.\n ";

MajorRecommender mathBot= new MajorRecommender();
mathBot.majorMessage="From your answers, I have seen an interest in the field of Math, Science, and Engineering.";
mathBot.recommendedMajors="Biology, Chemistry, Electrical Engineering, Mechanical Engineering, Physics, Biochemistry,\nBiomedical Engineering, Chemical Engineering, Computer Engineering, Geology, Industrial Engineering, Mathmatics, Aerospace Engineering, Civil Engineering,\nComputer Science, Minring Engineering, and Petroleum Engineering.\n ";

MajorRecommender natureBot= new MajorRecommender();
natureBot.majorMessage="From your answers, I have seen an interest in the field of Agriculture and Nature";
natureBot.recommendedMajors="Agribusiness, Horticulture, Recreation Parks and Tourism Resources, Agricultural Education,\nEnvironmental Geoscience, Forest Resources Management, Wood Scinece Technology, Agroecology, Enviromental Microbiology, Biology, Energy Land Managment,\nEnvironmental Sciences, Wildlife and Fisheries Resources\n ";

MajorRecommender englishBot= new MajorRecommender();
englishBot.majorMessage="From your answers, I have seen an interest in the field of Language, History, or Religion.";
englishBot.recommendedMajors="English, Philosophy Anthropology, Art History, Journalism, Speech Pathology and Audiology,\nHistory, Political Science, Religious Studies, Social Work, and World Language.\n ";

MajorRecommender medBot= new MajorRecommender();
medBot.majorMessage="From your answers, I have seen an interest in the field of the health of the human mind and body.";
medBot.recommendedMajors="Biology, Chemistry, Biochemistry, Biomedical, Forensic Science, Occupational Therapy, Pre-pharmacy,\nPsychology, Sociology, Child Development and Family Studies, Health Information, Medical Labratory Science, Public Health, Dental Hygeine, Sports and Exercise Psychology,\nand Exercise Physiology.\n ";

//Questionnaire

System.out.println("The following survey will ask you questions to better understand your interests, please enter yes or no to answer the following 25 questions");


System.out.println("Question 1: Could you ever see yourself working in the field of business or education");
questionOne=input.nextLine();

System.out.println("Question 2: Could you ever see yourself working in the field of art or music");
questionTwo=input.nextLine();

System.out.println("Question 3: Could you ever see yourself working in the field of math, engineering, or sciences");
questionThree=input.nextLine();

System.out.println("Question 4: Could you ever see yourself working in the field of physical or mental health?");
questionFour=input.nextLine();

System.out.println("Question 5: Could you ever see yourself working in the field of agriculture or nature?");
questionFive=input.nextLine();

System.out.println("Question 6: Could you ever see yourself working in the field of philosophy, religion, History, or Journalism?");
questionSix=input.nextLine();

System.out.println("Question 7: During your prior education, did you do well in your upper level math and science courses?");
questionSeven=input.nextLine();

System.out.println("Question 8: Do you have heavy interest in creating and or studying art of music?");
questionEight=input.nextLine();

System.out.println("Question 9: Do you think you could happily work in an office or classroom setting?");
questionNine=input.nextLine();

System.out.println("Question 10: Is observing nature or working in an environmental field something you could spend your career doing?");
questionTen=input.nextLine();

System.out.println("Question 11: Are you interested in a field of medicine or psychology?");
questionEleven=input.nextLine();

System.out.println("Question 12: Do you enjoy writing or observing philosophy, religion, history, or current events?");
questionTwelve=input.nextLine();

System.out.println("Question 13: Do you find the human mind or body interesting and something worth studying?");
questionThirteen=input.nextLine();

System.out.println("Question 14: Do you enjoy languages and their applications and uses (English Included)");
questionFourteen=input.nextLine();

System.out.println("Question 15: Is managing, accounting for, marketing for, or owning a business sound like an enjoyable career?");
questionFifteen=input.nextLine();

System.out.println("Question 16: Do you consider yourself a creative person?");
questionSixteen=input.nextLine();

System.out.println("Question 17: Do you think you could see yourself succeed in a field revolving around math and science and their applications?");
questionSeventeen=input.nextLine();

System.out.println("Question 18: Have you ever had any hands on experience working in agriculutre or nature?");
questionEighteen=input.nextLine();

System.out.println("Question 19: Do you find the subjects of philosophy, religion, or history interesting?");
questionNineteen=input.nextLine();

System.out.println("Question 20: Would you one day like to help others with their physical or mental health?");
questionTwenty=input.nextLine();

System.out.println("Question 21: Is teaching or helping others learn something you are skilled at or would like to be skilled at?");
questionTwentyOne=input.nextLine();

System.out.println("Question 22: Would you be willing to put the effort into art or music needed to graduate in a field of creative nature?");
questionTwentyTwo=input.nextLine();

System.out.println("Question 23: Do you enjoy the idea of using math and science to learn new things and apply them to everyday life?");
questionTwentyThree=input.nextLine();

System.out.println("Question 24: Does working outside in nature or agriculture seem like a career you would thrive in?");
questionTwentyFour=input.nextLine();  
//System.out.println("Okay, no survey will be conducted.\nHave a nice day!");


//Interest Addition
if (questionOne.equalsIgnoreCase("yes")) {
	businessBot.interestLevel = businessBot.interestLevel +1;
};

if (questionTwo.equalsIgnoreCase("yes")) {
	artBot.interestLevel = artBot.interestLevel +1;
};

if (questionThree.equalsIgnoreCase("yes")) {
	mathBot.interestLevel = mathBot.interestLevel +1;
};

if (questionFour.equalsIgnoreCase("yes")) {
	medBot.interestLevel = medBot.interestLevel +1;
};

if (questionFive.equalsIgnoreCase("yes")) {
	natureBot.interestLevel = natureBot.interestLevel +1;
};

if (questionSix.equalsIgnoreCase("yes")) {
	englishBot.interestLevel = englishBot.interestLevel +1;
};

if (questionSeven.equalsIgnoreCase("yes")) {
	mathBot.interestLevel = mathBot.interestLevel +1;
};

if (questionEight.equalsIgnoreCase("yes")) {
	artBot.interestLevel = artBot.interestLevel +1;
};

if (questionNine.equalsIgnoreCase("yes")) {
	businessBot.interestLevel = businessBot.interestLevel +1;
};

if (questionTen.equalsIgnoreCase("yes")) {
	natureBot.interestLevel = natureBot.interestLevel +1;
};

if (questionEleven.equalsIgnoreCase("yes")) {
	medBot.interestLevel = medBot.interestLevel +1;
};

if (questionTwelve.equalsIgnoreCase("yes")) {
	englishBot.interestLevel = englishBot.interestLevel +1;
};


if (questionThirteen.equalsIgnoreCase("yes")) {
	medBot.interestLevel = medBot.interestLevel +1;
};

if (questionFourteen.equalsIgnoreCase("yes")) {
	englishBot.interestLevel = englishBot.interestLevel +1;
};


if (questionFifteen.equalsIgnoreCase("yes")) {
	businessBot.interestLevel = businessBot.interestLevel +1;
};

if (questionSixteen.equalsIgnoreCase("yes")) {
	artBot.interestLevel = artBot.interestLevel +1;
};

if (questionSeventeen.equalsIgnoreCase("yes")) {
	mathBot.interestLevel = mathBot.interestLevel +1;
};

if (questionEighteen.equalsIgnoreCase("yes")) {
	natureBot.interestLevel = natureBot.interestLevel +1;
};

if (questionNineteen.equalsIgnoreCase("yes")) {
	englishBot.interestLevel = englishBot.interestLevel +1;
};


if (questionTwenty.equalsIgnoreCase("yes")) {
	medBot.interestLevel = medBot.interestLevel +1;
};

if (questionTwentyOne.equalsIgnoreCase("yes")) {
	businessBot.interestLevel = businessBot.interestLevel +1;
};

if (questionTwentyTwo.equalsIgnoreCase("yes")) {
	artBot.interestLevel = artBot.interestLevel +1;
};

if (questionTwentyThree.equalsIgnoreCase("yes")) {
	mathBot.interestLevel = mathBot.interestLevel +1;
};

if (questionTwentyFour.equalsIgnoreCase("yes")) {
	natureBot.interestLevel = natureBot.interestLevel +1;
};

//Recommendation and interest addition
if (businessBot.interestLevel >= 2) {
System.out.println(businessBot.majorMessage + ("\nFrom this observation I reccomend theses Majors:"));
System.out.println(businessBot.recommendedMajors);
}



if (artBot.interestLevel >= 2) {
System.out.println(artBot.majorMessage + ("\nFrom this observation I reccomend theses Majors:"));
System.out.println(artBot.recommendedMajors);
}

if (mathBot.interestLevel >= 2) {
System.out.println(mathBot.majorMessage + ("\nFrom this observation I reccomend theses Majors:"));
System.out.println(mathBot.recommendedMajors);
}

if (medBot.interestLevel >= 2) {
System.out.println(medBot.majorMessage + ("\nFrom this observation I reccomend theses Majors:"));
System.out.println(medBot.recommendedMajors);
}

if (natureBot.interestLevel >= 2) {
System.out.println(natureBot.majorMessage + ("\nFrom this observation I reccomend theses Majors:"));
System.out.println(natureBot.recommendedMajors);
}
if (englishBot.interestLevel >= 2) {
System.out.println(englishBot.majorMessage + ("\nFrom this observation I reccomend theses Majors:"));
System.out.println(englishBot.recommendedMajors);
}
if(artBot.interestLevel<2 && mathBot.interestLevel<2 && medBot.interestLevel<2 && natureBot.interestLevel<2 && englishBot.interestLevel<2 && businessBot.interestLevel<2) {
System.out.println("You don't seem seem interested in my reccomended majors, maybe you should visit the WVU major list\nhttps://admissions.wvu.edu/academics/majors");
}
}
}
}
