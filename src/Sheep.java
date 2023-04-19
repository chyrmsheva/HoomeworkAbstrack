public class Sheep extends Animal {
    public Sheep(int weight, int age, String gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    @Override
    public String toString() {
        return "\n Sheep{" +
                "weight=" + getWeight() +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                ", nickName='" + getNickName() + '\'' +
                '}';
    }
}
