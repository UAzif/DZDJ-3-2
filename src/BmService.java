public class BmService {
    public float calculate(float height, int bodyMass) {
        float bodyMassIndeximt = bodyMass/(height*height);
        return bodyMassIndeximt;

    }
}
