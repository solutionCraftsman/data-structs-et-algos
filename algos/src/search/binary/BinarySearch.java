package search.binary;

public class BinarySearch {

    public static int find(int[] dataToSearch, int searchKey) {

        int lowerIndex;
        int higherIndex;
        int middleIndex;
        int middleData;
        int foundKeyIndex = -1;
        boolean isFound = false;

        lowerIndex = 0;
        higherIndex = dataToSearch.length - 1;

        do {
            middleIndex = (lowerIndex + higherIndex) / 2;
            middleData = dataToSearch[middleIndex];

            if(middleData == searchKey) {
                foundKeyIndex = middleIndex;
                isFound = true;
            }
            else if(middleData > searchKey) {
                higherIndex = middleIndex - 1;
            } else {
                lowerIndex = middleIndex + 1;
            }
        } while (!isFound && (lowerIndex <= higherIndex));

        return foundKeyIndex;
    }
}
