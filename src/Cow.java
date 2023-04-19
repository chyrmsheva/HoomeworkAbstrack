public class Cow  extends  Animal{

    public Cow(int weight, int age, String gender, String nickName) {
        super(weight, age, gender, nickName);
    }
        @Override
        public String toString() {
            return "\n Cow {" +
                    "weight=" + getWeight() +
                    ", age=" + getAge() +
                    ", gender='" + getGender() + '\'' +
                    ", nickName='" + getNickName() + '\'' +
                    '}';
        }


    }






