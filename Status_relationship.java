package lib;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class Status_relationship {

	private String spouseName;
	private String spouseIdNumber;
	private List<String> childNames;
	private List<String> childIdNumbers;


    public String getSpouseName() {
        return this.spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    public String getSpouseIdNumber() {
        return this.spouseIdNumber;
    }

    public void setSpouseIdNumber(String spouseIdNumber) {
        this.spouseIdNumber = spouseIdNumber;
    }

    public List<String> getChildNames() {
        return this.childNames;
    }

    public void setChildNames(List<String> childNames) {
        this.childNames = childNames;
    }

    public List<String> getChildIdNumbers() {
        return this.childIdNumbers;
    }

    public void setChildIdNumbers(List<String> childIdNumbers) {
        this.childIdNumbers = childIdNumbers;
    }
}


// Pada saat pengerjaan saya dibantu dan berdiskusi dengan
// Afrian Luthfan - 1302194001
// Raja Simontua - 1302194094
// Refrensi Pengerjaan saya = https://lms.telkomuniversity.ac.id/course/view.php?id=19800#section-4