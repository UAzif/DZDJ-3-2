public class BmService {
    public float calculate(float height, int bodyMass) {
        float bodyMassIndex = bodyMass/(height*height);
        return bodyMassIndex;

    }
}
