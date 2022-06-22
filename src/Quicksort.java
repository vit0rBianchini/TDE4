import java.util.Stack;

class Quicksort {
  static void quickSort(int[] vetor) {
    Stack<Integer> stack = new Stack<>();
    stack.push(0);
    stack.push(vetor.length);

    while (!stack.isEmpty()) {
        int end = stack.pop();
        int start = stack.pop();
        if (end - start < 2) {
            continue;
        }
        int p = start + ((end - start) / 2);
        p = separarQuicksort(vetor, p, start, end);

        stack.push(p + 1);
        stack.push(end);

        stack.push(start);
        stack.push(p);
    }
  }

static private int separarQuicksort(int[] vetor, int p, int inicio, int fim) {
    int l = inicio;
    int h = fim - 2;
    int piv = vetor[p];
    troca(vetor, p, fim - 1);
    while (l < h) {
        if (vetor[l] < piv) {
            l++;
        } else if (vetor[h] >= piv) {
            h--;
        } else {
            swap(vetor, l, h);
        }
    }
    int idx = h;
    if (vetor[h] < piv) {
        idx++;
    }
    swap(vetor, fim - 1, idx);
    return idx;
}
private static void troca(int[] arr, int i, int j) {
  int temp = arr[i];
  arr[i] = arr[j];
  arr[j] = temp;
}

private static void swap(int[] a, int i, int j) {
  int temp = a[i];
  a[i] = a[j];
  a[j] = temp;
}

}