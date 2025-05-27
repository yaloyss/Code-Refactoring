package module5.task5_3;

public class Element
{
    public void searchElement(int[] array, int target)
    {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target)
            {
                System.out.println("Element found");
                return;
            }
        }
        System.out.println("Element not found");
    }

}
