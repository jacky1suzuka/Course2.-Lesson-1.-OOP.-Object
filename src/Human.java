

public class Human {

    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    Human(String name, String town, int yearOfBirth, String jobTitle) {
        if (name == null || name.equals("")) {
            this.name = "'Информация не указана'";
        } else {
            this.name = name;
        }


        if (town == null || town.equals("")) {
            this.town = "'Информация не указана'";
        }else{
            this.town = town;
        }


        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }


        if (jobTitle == null || jobTitle.equals("")) {
            this.jobTitle = "'Информация не указана'";
        }else {
            this.jobTitle = jobTitle;
        }
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + this.name +
                ". Я из города " + this.town +
                ". Год моего рождения " + this.yearOfBirth +
                ". Я работаю на должности " + this.jobTitle + ". Будем знакомы!";
    }

}
