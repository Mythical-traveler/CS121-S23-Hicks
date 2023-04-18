public class ArrayDemo1 {
    public static void main(String[] args) {
        int[][][][] fs = {
                {
                        {
                                {0, 1, 1}, {2, 3, 5,}, {8, 13, 21}
                        }
                }
        };
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 1; j++) {
                for (int z = 0; z < 3; z++) {
                    for (int g = 0; g < 3; g++) {
                        System.out.println("fs [" + i + "][" + j + "][" + z + "][" + g + "] = " + fs[i][j][z][g]);
                    }
                }
            }
        }


        int[][][][] fsb = {
                {
                        {
                                {21, 13, 8}, {5, 3, 2,}, {1, 1, 0}
                        }
                }
        };

        for (int a = 0; a < 1; a++) {
            for (int b = 0; b < 1; b++) {
                for (int c = 0; c < 3; c++) {
                    for (int d = 0; d < 3; d++) {
                        System.out.println("fsb [" + a + "]" + "[" + b + "]+[" + c + "]+[" + d + "]=" + fsb[a][b][c][d]);

                    }

                }
            }
        }
    }
    }


