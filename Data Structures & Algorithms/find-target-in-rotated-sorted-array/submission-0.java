class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        // 1. Usamos <= para no ignorar el último elemento cuando left == right
        while (left <= right) {
            // 2. RECALCULAR el middle adentro del ciclo
            int middle = left + (right - left) / 2;

            // 3. Si lo encontramos, salimos de inmediato
            if (nums[middle] == target) {
                return middle;
            }

            // 4. PREGUNTA: ¿La mitad izquierda está ordenada?
            if (nums[left] <= nums[middle]) {
                // Si está ordenada, vemos si el target cae en este rango
                if (target >= nums[left] && target < nums[middle]) {
                    right = middle - 1; // Buscar a la izquierda
                } else {
                    left = middle + 1;  // Buscar a la derecha
                }
            } 
            // 5. OTRAS: Si la izquierda no está ordenada, la derecha DEBE estarlo
            else {
                // Vemos si el target cae en el rango de la derecha ordenada
                if (target > nums[middle] && target <= nums[right]) {
                    left = middle + 1;  // Buscar a la derecha
                } else {
                    right = middle - 1; // Buscar a la izquierda
                }
            }
        }

        // 6. Si el ciclo termina y no regresamos nada, el target no existe
        return -1;
    }
}