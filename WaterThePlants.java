//User function Template for Java

class Solution
{
    int min_sprinklers(int gallery[], int n)
    {
        // code here
        ArrayList<int[]> sprinklers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (gallery[i] != -1) {
                sprinklers.add(new int[]{i - gallery[i], i + gallery[i]});
            }
        }

        Collections.sort(sprinklers, (a, b) -> a[0] - b[0]);

        int sprinklersCount = 0;
        int i = 0;
        int target = 0;

        while (target < n) {
            if (i == sprinklers.size() || sprinklers.get(i)[0] > target) {
                return -1;
            }

            int maxRange = sprinklers.get(i)[1];
            while (i + 1 < sprinklers.size() && sprinklers.get(i + 1)[0] <= target) {
                i++;
                maxRange = Math.max(maxRange, sprinklers.get(i)[1]);
            }

            if (maxRange < target) {
                return -1;
            }

            sprinklersCount++;
            target = maxRange + 1;
            i++;
        }

        return sprinklersCount;
    }
    }
