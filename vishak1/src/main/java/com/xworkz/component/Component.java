package com.xworkz.component;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.DTO.BevrageDTO;
import com.xworkz.DTO.ChatDTO;
import com.xworkz.DTO.EducationDTO;
import com.xworkz.DTO.MobileDTO;


@org.springframework.stereotype.Component
@RequestMapping("/")
public class Component {
public Component() {
	System.out.println("Running VishakComponent....");
}
@PostMapping("/email")
public String onEmail(Model model) {
	System.out.println("Runnning Email...");
	model.addAttribute("email","vishak.xworkz@gmail.com");
	return "index.jsp";
}

@PostMapping("/mNumber")
public String onMobileNumber(Model model) {
	System.out.println("Running onMobileNumber.....");
	model.addAttribute("mobileNumber",7349101919L);
	return "index.jsp";
}
@PostMapping("/addhar")
public String onAddar(Model model) {
	System.out.println("Running onAddhar...");
	model.addAttribute("addharNumber", "3087 8592 9277");
	return "index.jsp";
}
@PostMapping("/age")
public String onAge(Model model) {
	System.out.println("Running onAge.....");
	model.addAttribute("age", 22);
	return "index.jsp";
}
@PostMapping("/dateOfBirth")
public String onDateOfBirth(Model model) {
	System.out.println("Running onDateOfBirth.....");
	model.addAttribute("dateOfBirth",LocalDateTime.of(2000,05,04,11,37));
	return "index.jsp";
}
@PostMapping("/desiredSalary")
public String onDesiredSalary(Model model) {
	System.out.println("Running onDesiredSalary....");
	model.addAttribute("desiredSalary","6 LPA");
	return "index.jsp";
}
@PostMapping("/bestFriend")
public String onBestFriend(Model model) {
	System.out.println("Running onBestFriend....");
	ArrayList<String> al = new ArrayList<String>();
	al.add("mani");
	al.add("gani");
	al.add("prasadh");
	al.add("vinayak");
	al.add("hithesh");
	al.add("shaman");
	al.add("Akash");
	al.add("athmesh");
	al.add("manu");
	al.add("sushmitha");
	model.addAttribute("friends", al);
	return "index.jsp";
}
@PostMapping("/vistedPlaces")
public String onVistedPlaces(Model model) {
	System.out.println("Running onVistedPlaces......");
	ArrayList<String> pl = new ArrayList<String>();
	pl.add("Mysore");
	pl.add("Bangalore");
	pl.add("Shivamogga");
	pl.add("hosanagara");
	pl.add("Badravathi");
	pl.add("Madikeri");
	pl.add("kadur");
	pl.add("Chikkamagalur");
	pl.add("Hubli");
	pl.add("Hassan");
	model.addAttribute("places", pl);
	return "index.jsp";
}
@PostMapping("/skillSet")
public String onSkillSet(Model model) {
	System.out.println("Running onSkillSet......");
	ArrayList<String> sl = new ArrayList<String>();
	sl.add("Core-Java");
	sl.add("HTML");
	sl.add("CSS");
	sl.add("JavaScript");
	sl.add("SQL");
	sl.add("MSOffice");
	sl.add("MSExcel");
	sl.add("PowerPoint");
	sl.add("VsCode");
	sl.add("Eclipse");
	model.addAttribute("skill", sl);
	return "index.jsp";
}
@PostMapping("/education")
public String onEducation(Model model) {
	System.out.println("Running onEducation....");
	EducationDTO edto = new EducationDTO("GFGC","Ripponpete","BSC","cs",8,2018,2021,7.91f,0,true);
	model.addAttribute("collegeName", edto.getCollegeName());
	model.addAttribute("collegeAddress", edto.getCollegeAddress());
	model.addAttribute("degree", edto.getDegree());
	model.addAttribute("course", edto.getCourse());
	model.addAttribute("cgpa", edto.getCGPA());
	model.addAttribute("duration", edto.getDuration());
	model.addAttribute("joinedYear", edto.getJoinedYear());
	model.addAttribute("completedYear", edto.getCompletedYear());
	model.addAttribute("backLogs", edto.getNumberOfBacklogs());
	model.addAttribute("cleared",edto.isBacklogsCleared());
	return "index.jsp";
}
@PostMapping("/mobile")
public String onMobile(Model model) {
	System.out.println("Running onMobile.....");
	MobileDTO mdto = new MobileDTO("Vivo",17,"vivo_Launcher",LocalDate.of(2022,02,04),128);
	model.addAttribute("mobileName", mdto.getMobileName());
	model.addAttribute("numberOfApplications", mdto.getNumberOfApllications());
	model.addAttribute("mostUsedApp", mdto.getMostUsedApllication());
	model.addAttribute("internalStorage", mdto.getInternalStorage());
	model.addAttribute("mobileBroughtDate",mdto.getMobileBroughtDate());
	return "index.jsp";
}
@PostMapping("/beverage")
public String onBeverage(Model model) {
	System.out.println("Runnning onBeverage....");
	BevrageDTO bdto = new BevrageDTO("slice","cold-drinks",7,7d,LocalDate.of(2023, 04, 30));
	model.addAttribute("mostLikedBreverage", bdto.getMostLikedBreverage());
	model.addAttribute("nameOfMostDrinkedBreverage", bdto.getNameofMostDrinkedBeverage());
	model.addAttribute("numberofTimesBreverageHadinDay", bdto.getNumberofTimesBreverageHadinDay());
	model.addAttribute("expireDate", bdto.getExpireDate());
	model.addAttribute("breveragePrice", bdto.getPrice());
	return "index.jsp";
}
@PostMapping("/chat")
public String onChat(Model model) {
	System.out.println("Running onChat....");
	ChatDTO cdto = new ChatDTO(7,"INSTA",12,6,50);
	model.addAttribute("mostUsedMessagingApp", cdto.getMostUsedMessagingApp());
	model.addAttribute("numberOfChatPerDay", cdto.getNumberOfChatPerDay());
	model.addAttribute("numberofgroupChat", cdto.getNumberofgroupChat());
	model.addAttribute("numberOfMessagingApp", cdto.getNumberOfMessagingApp());
	model.addAttribute("totalNumberOfChat", cdto.getTotalNumberOfChat());
	return "index.jsp";
}

}