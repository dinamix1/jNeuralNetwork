import networks.LayerNetwork;
import networks.Network;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Ugo on 25/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        int inputSize = 8;
        int numberHiddenLayer = 1;
        int hiddenSize = 1;
        int outputSize = 8;
        Network network = new LayerNetwork(inputSize, numberHiddenLayer, hiddenSize, outputSize);
        List<List<Integer>> input = Arrays.asList(
                Arrays.asList(new Integer[]{1, 0, 0, 0, 0, 0, 0, 0}),
                Arrays.asList(new Integer[]{0, 1, 0, 0, 0, 0, 0, 0}),
                Arrays.asList(new Integer[]{0, 0, 1, 0, 0, 0, 0, 0}),
                Arrays.asList(new Integer[]{0, 0, 0, 1, 0, 0, 0, 0}),
                Arrays.asList(new Integer[]{0, 0, 0, 0, 1, 0, 0, 0}),
                Arrays.asList(new Integer[]{0, 0, 0, 0, 0, 1, 0, 0}),
                Arrays.asList(new Integer[]{0, 0, 0, 0, 0, 0, 1, 0}),
                Arrays.asList(new Integer[]{0, 0, 0, 0, 0, 0, 0, 1})
                );
        List<List<Integer>> output = Arrays.asList(
                Arrays.asList(new Integer[]{1, 0, 0, 0, 0, 0, 0, 0}),
                Arrays.asList(new Integer[]{0, 1, 0, 0, 0, 0, 0, 0}),
                Arrays.asList(new Integer[]{0, 0, 1, 0, 0, 0, 0, 0}),
                Arrays.asList(new Integer[]{0, 0, 0, 1, 0, 0, 0, 0}),
                Arrays.asList(new Integer[]{0, 0, 0, 0, 1, 0, 0, 0}),
                Arrays.asList(new Integer[]{0, 0, 0, 0, 0, 1, 0, 0}),
                Arrays.asList(new Integer[]{0, 0, 0, 0, 0, 0, 1, 0}),
                Arrays.asList(new Integer[]{0, 0, 0, 0, 0, 0, 0, 1})
                );

        for(int i = 0; i < 1000; i++) {
            network.trainStochastic(input.get(0), output.get(0));
        }
        network.forwardFeedNetwork(input.get(0));
    }
}