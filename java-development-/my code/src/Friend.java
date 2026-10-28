public class Friend {
    String name;
    static int friendsCount;

    Friend(String name){
        this.name=name;
        friendsCount++;
    }
    void display(){
        System.out.println("total number of friends are " + friendsCount);
    }
}
