package leetCode;

public class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //ia juntar os dois arrays
        //depois somar e fazer a media
        int sizeArr1 = nums1.length;
        int sizeArr2 = nums2.length;
        int sumSize =  sizeArr1 + sizeArr2;
        //Criando o array para inserir os ordenados
        int mergedArray[] = new int[sumSize];
        int p = 0;
        int n1 = 0;
        int n2 = 0;

        //se por acaso p for maior que 0, é porque alguém algum value
        //aqui não tem preocupaçãop de indexOfBount
        while(p < sumSize){
            if(n2 < sizeArr2){
                if(n1 < sizeArr1){
                        mergedArray[p++] = nums1[n1] > nums2[n2] ? nums2[n2++] : nums1[n1++];
                        continue;
                }
                mergedArray[p++] = nums2[n2++];
                continue;
            }
            mergedArray[p++] = nums1[n1++];
        }
        if(mergedArray.length % 2 == 0){
            int div = mergedArray.length / 2;
            double median = (double) (mergedArray[div - 1] + mergedArray[div]) / 2;
            return median;
        }else{
            int div = mergedArray.length / 2;
            double median = mergedArray[div];
            return median;
        }
    }
}