package data.binding.sample.android;

public class User {
    public String name;// this variable is made public to avoid following error while running the app. data binding error ****msg:Could not find accessor data.binding.sample.android.User.name

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}