package strategy;

import java.util.List;

public class MyList {

  private ISortAlgorithm sortAlgorithm;
  private List list;

  public MyList() {

    sortAlgorithm = new BubbleSort();
  }

  public void setSortAlgorithm(ISortAlgorithm algorithm){
    sortAlgorithm = algorithm;
  }

  public void sort() {
    this.sortAlgorithm.sort(list);
  }

}

