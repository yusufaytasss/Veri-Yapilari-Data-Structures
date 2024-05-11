public class Nodes {
    int number;
    String Name;
    String LastName;
    int visa;
    int fınal;
    double average;
    String situation;

    Nodes next;

    public Nodes(int number, String name, String lastName, int visa, int fınal) {
        this.number = number;
        Name = name;
        LastName = lastName;
        this.visa = visa;
        this.fınal = fınal;
        average = visa * 0.4 + fınal * 0.6;
        if (average >= 50) {
            situation = "Passed";
        } else {
            situation = "stayed";
        }
        next = null;
    }
}
