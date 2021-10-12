import java.util.*;
import java.io.*;

public class ReadEmployees {
	public static void main(String[] args){
		//gets the filepath
		String filename = args[0];
       
        try{
			// creates a new hashmap for the company name, with an arraylist for all the employee names inside the company
            HashMap<String, ArrayList<String>> allCompaniesWithEmployees = new HashMap<String, ArrayList<String>>();

			File f = new File(filename);
            Scanner sc = new Scanner(f);

            while (sc.hasNextLine()){
				//initiallises the array lists
				ArrayList<String> newEmployeeList = new ArrayList<String>();
				ArrayList<String> existingEmployeeList;

				// splits the txt file to an array of the strings
                String[] lineArray = (sc.nextLine()).split(" ");

                String companyName = lineArray[0];
                String nameOfEmployee = lineArray[1];

				// if the hashmap already contains the company's name then it adds the next employee
				if (allCompaniesWithEmployees.containsKey(companyName)) {
					//gets the employee list that already exists, adds the new employee to the existing list then sets the company with the new list
					existingEmployeeList = allCompaniesWithEmployees.get(companyName);
					existingEmployeeList.add(nameOfEmployee);
					allCompaniesWithEmployees.put(companyName, existingEmployeeList);
				} else {
					// adds a single employee so it can be put into the array list
					newEmployeeList.add(nameOfEmployee);
					allCompaniesWithEmployees.put(companyName, newEmployeeList);
				}
            }

			// initialises values
			//sets the largest employee as the lowest possible
			int mostEmployees = -1; //Double.POSITIVE_INFINITY Double.NEGATIVE_INFINITY 
			String largestCompanyName = "";
			ArrayList<String> employeeList;
			
			// gets all the company's names as a set then goes through all the company's names NOTE: if you had a LinkedHashMap it will return the keys in order
			for (String companyName : allCompaniesWithEmployees.keySet()) {
				//gets the employee arraylist from the key of the company
				employeeList = allCompaniesWithEmployees.get(companyName);

				// checks if its larger
				if (employeeList.size() > mostEmployees){
					mostEmployees = employeeList.size();
					largestCompanyName = companyName;
				} 
			}

			System.out.println(largestCompanyName);
			for (String name : (allCompaniesWithEmployees.get(largestCompanyName))) {
				System.out.println(name);
			}

        } catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}