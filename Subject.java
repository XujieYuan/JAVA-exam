/**
 * This is a class for preparing final exam when need to use an object
 */

public class Subject
{
    private String subjectName;
    private String unitCode;
    private String lecturer;
    private String term;

    public Subject()
    {
        subjectName = "";
        unitCode = "";
        lecturer = "";
        term = "";
    }

    public Subject(String newSubjectName, String newUnitCode, String newLecturer, String newTerm)
    {
        subjectName = newSubjectName;
        unitCode = newUnitCode;
        lecturer = newLecturer;
        term = newTerm;
    }

    public String getSubjectName()
    {
        return subjectName;
    }

    public String getUnitCode()
    {
        return unitCode;
    }

    public String getLecturer()
    {
        return lecturer;
    }

    public String getTerm()
    {
        return term;
    }

    public void setSubjectName(String subjectName)
    {
        this.subjectName = subjectName;
    }

    public void setUnitCode(String unitCode)
    {
        this.unitCode = unitCode;
    }

    public void setLecturer(String lecturer)
    {
        this.lecturer = lecturer;
    }

    public void setTerm(String term)
    {
        this.term = term;
    }
}
