package CAS.Data;

import java.util.ArrayDeque;
import java.util.ArrayList;


public class TAF {
	private Date dateOfSubmission;
	private ArrayList<Day> preferredDays;
	private ArrayList<TimeSchedule> preferredTimes;
	private ArrayDeque<String> preferredCourses;
        
        public TAF(ArrayList<Day> preferredDays,ArrayList<TimeSchedule> preferredTimes,ArrayDeque<String> preferredCourses){
            this.preferredDays = preferredDays;
            this.preferredTimes = preferredTimes;
            this.preferredCourses = preferredCourses;
        }
	
	public Date getDateOfSubmission(){
		return dateOfSubmission;
	}
	public ArrayList<Day> getPreferredDays(){
		return preferredDays;
	}
	public ArrayList<TimeSchedule> getPreferredTimes(){
		return preferredTimes;
	}
	public ArrayDeque<String> getPreferredCourses(){
		return preferredCourses;
	}
}
