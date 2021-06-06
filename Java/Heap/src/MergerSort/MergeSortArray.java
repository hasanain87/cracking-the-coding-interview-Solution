package MergerSort;
public static class MergeSortArray {
  private long[] theArray;
  private int nElems;
  public MergeSortArray(int max) {
    theArray = new long[max];
    nElems = 0;
  }
  public void insert(long value) {
    theArray[nElems] = value; // insert it
    nElems++; // increment size
  }
  public void display() {
    for (int j = 0; j < nElems; j++)
      System.out.print(theArray[j] + " ");
    System.out.println("");
  }
  public void mergeSort() {
    long[] workSpace = new long[nElems];
    recMergeSort(workSpace, 0, nElems - 1);
  }
  private void recMergeSort(long[] workSpace, int lowerBound, int upperBound) {
      if (lowerBound == upperBound) // if range is 1,
      return; // no use sorting
    else { // find midpoint
      int mid = (lowerBound + upperBound) / 2;
      // sort low half
      recMergeSort(workSpace, lowerBound, mid);
      // sort high half
      recMergeSort(workSpace, mid + 1, upperBound);
      // merge them
      merge(workSpace, lowerBound, mid + 1, upperBound);
    }
  }
  private void merge(long[] workSpace, int lowPtr, int highPtr, int upperBound) {
    int j = 0; // workspace index
    int lowerBound = lowPtr;
    int mid = highPtr - 1;
    int n = upperBound - lowerBound + 1; // # of items
    int count1=0;
    
    while (lowPtr <= mid && highPtr <= upperBound)
    {
      if (theArray[lowPtr] < theArray[highPtr])
      {workSpace[j++] = theArray[lowPtr++];
      count1++;
      }
      else
      { workSpace[j++] = theArray[highPtr++];
         count1++;
      }
    while (lowPtr <= mid)
    { workSpace[j++] = theArray[lowPtr++];
        count1++;
    }
    while (highPtr <= upperBound)
    { workSpace[j++] = theArray[highPtr++];
        count1++;
    }
    for (j = 0; j < n; j++)
    {theArray[lowerBound + j] = workSpace[j];
    }
    }
[B]System.out.println("Number of comparisons: " + count1 );[/B]
  }
}