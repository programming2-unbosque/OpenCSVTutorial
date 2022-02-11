package edu.unbosque.opencsvtutorial;

import java.util.ArrayList;
import java.util.List;

public class CsvTransfer {

    private List<PersonBean> csvList;

    public CsvTransfer() {}

    public void setCsvList(List<PersonBean> csvList) {
        this.csvList = csvList;
    }

    public List<PersonBean> getCsvList() {
        if (csvList != null) return csvList;
        return new ArrayList<>();
    }

}
