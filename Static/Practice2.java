class InstagramUser{
    String username;
    int followers;

    static String appName = "Instagram";

    void display(){
        System.out.println(username);
        System.out.println(followers);
        System.out.println(appName);
    }
}
public class Practice2 {
    public static void main(String[] args) {
        InstagramUser u1 = new InstagramUser();
        InstagramUser u2 = new InstagramUser();

        u1.username = "srushti13";
        u1.followers = 300;

        u1.display();

        u2.username="shrau";
        u2.followers=200;
        u2.display();

    }
    
}
