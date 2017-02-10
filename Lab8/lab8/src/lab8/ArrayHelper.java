package lab8;

public class ArrayHelper {
	int i, j, k, rows, columns;

	public void print2Darray(int[][] value) {
		System.out.println("Here is your array");
		for (j = 0; j < value.length; j++) {
			for (i = 0; i < value[j].length - 1; i++) {
				System.out.print(value[j][i] + ", ");
			}
			System.out.println(value[j][i]);
		}
	}

	public int arraySum(int[] value) {
		int j = 0;
		for (i = 0; i < value.length; i++) {
			k = value[i];
			j = k + j;
		}
		return j;
	}

	public double arrayAvg(int[] value) {
		double j = 0;
		for (i = 0; i < value.length; i++) {
			k = value[i];
			j = k + j;
		}
		j = j / value.length;
		return j;
	}

	public int arraySum2D(int[][] value) {
		int sum = 0;
		for (i = 0; i < value.length; i++) {
			for (j = 0; j < value[i].length; j++) {
				sum = sum + value[i][j];
			}
		}
		return sum;
	}

	public double arrayAvg2D(int[][] value) {
		double avg = 0;
		for (i = 0; i < value.length; i++) {
			for (j = 0; j < value[i].length; j++) {
				avg = avg + value[i][j];
			}
		}
		return (avg / (value[i - 1].length * value.length));
	}

	public int arrayMax2D(int[][] value) {
int max = value[0][0];
		for (i = 0; i < value.length; i++) {
			for (j = 0; j < value[i].length; j++) {
				if (max<value[i][j]){
					max = value[i][j];
				}
				
			}
		}
		return max;
	}

}
