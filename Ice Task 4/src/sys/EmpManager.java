package sys;



public class EmpManager {
    public static int _count = 0;     // number of Employees currently in the array
    private static int _capacity = 1; // max capacity (starts at 1)

    public static Employee[] employees = new Employee[_capacity];

    // ✅ Return number of Employees
    public static int size() {
        return _count;
    }

    // ✅ Return capacity
    public static int capacity() {
        return _capacity;
    }

    // ✅ Resize mechanism
    private static void resize() {
        // Grow if almost full
        if (_count >= _capacity) {
            grow();
            return;
        }

        // Shrink if less than half full
        if (_count > 0 && _count <= _capacity / 2) {
            shrink();
        }
    }

    // ✅ Double capacity
    private static void grow() {
        _capacity *= 2;
        Employee[] temp = new Employee[_capacity];
        for (int i = 0; i < _count; i++) {
            temp[i] = employees[i];
        }
        employees = temp;
    }

    // ✅ Halve capacity
    private static void shrink() {
        _capacity /= 2;
        if (_capacity < 1) _capacity = 1; // never below 1
        Employee[] temp = new Employee[_capacity];
        for (int i = 0; i < _count; i++) {
            temp[i] = employees[i];
        }
        employees = temp;
    }

    // ✅ Insert at end
    public static void insert(Employee emp) {
        if (_count >= _capacity) {
            grow();
        }
        employees[_count] = emp;
        _count++;
        resize();
    }

    // ✅ Insert at index
    public static void insert(Employee emp, int idx) {
        if (idx < 0 || idx > _count) {
            throw new IndexOutOfBoundsException("Invalid index: " + idx);
        }
        if (_count >= _capacity) {
            grow();
        }
        for (int i = _count; i > idx; i--) {
            employees[i] = employees[i - 1];
        }
        employees[idx] = emp;
        _count++;
        resize();
    }

    // ✅ Finders
    public static Employee findByID(long ID) {
        for (int i = 0; i < _count; i++) {
            if (employees[i].getID() == ID) {
                return employees[i];
            }
        }
        return null;
    }

    public static Employee findByName(String name) {
        for (int i = 0; i < _count; i++) {
            if (employees[i].getName().equals(name)) {
                return employees[i];
            }
        }
        return null;
    }

    public static Employee findBySurname(String surname) {
        for (int i = 0; i < _count; i++) {
            if (employees[i].getSurname().equals(surname)) {
                return employees[i];
            }
        }
        return null;
    }

    // ✅ Index finders
    public static int getIndex(Employee emp) {
        for (int i = 0; i < _count; i++) {
            if (employees[i].equals(emp)) {
                return i;
            }
        }
        return -1;
    }

    public static int getIndexByID(long ID) {
        for (int i = 0; i < _count; i++) {
            if (employees[i].getID() == ID) {
                return i;
            }
        }
        return -1;
    }

    public static int getIndexByName(String name) {
        for (int i = 0; i < _count; i++) {
            if (employees[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public static int getIndexBySurname(String surname) {
        for (int i = 0; i < _count; i++) {
            if (employees[i].getSurname().equals(surname)) {
                return i;
            }
        }
        return -1;
    }

    // ✅ Remove by index
    public static Employee remove(int idx) {
        if (idx < 0 || idx >= _count) {
            throw new IndexOutOfBoundsException("Invalid index: " + idx);
        }
        Employee removed = employees[idx];
        for (int i = idx; i < _count - 1; i++) {
            employees[i] = employees[i + 1];
        }
        employees[_count - 1] = null;
        _count--;
        resize();
        return removed;
    }

    // ✅ Remove overloads
    public static Employee removeByID(long ID) {
        int idx = getIndexByID(ID);
        if (idx == -1) return null;
        return remove(idx);
    }

    public static Employee removeByName(String name) {
        int idx = getIndexByName(name);
        if (idx == -1) return null;
        return remove(idx);
    }

    public static Employee removeBySurname(String surname) {
        int idx = getIndexBySurname(surname);
        if (idx == -1) return null;
        return remove(idx);
    }

    // ✅ Print all employees
    public static void print() {
        for (int i = 0; i < _count; i++) {
            System.out.println(employees[i]);
        }
    }
}
