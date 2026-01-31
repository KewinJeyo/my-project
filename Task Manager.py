import sys

def show_menu():
    print("\n--- 📝 SIMPLE TASK MANAGER ---")
    print("1. View Tasks")
    print("2. Add Task")
    print("3. Remove Task")
    print("4. Exit")

def main():
    tasks = ["Learn Git", "Upload first project"]
    
    while True:
        show_menu()
        choice = input("\nChoose an option (1-4): ")

        if choice == '1':
            print("\nYOUR TASKS:")
            for i, task in enumerate(tasks, 1):
                print(f"{i}. {task}")
        elif choice == '2':
            new_task = input("Enter the task: ")
            tasks.append(new_task)
            print("Task added!")
        elif choice == '3':
            try:
                idx = int(input("Enter task number to remove: ")) - 1
                removed = tasks.pop(idx)
                print(f"Removed: {removed}")
            except (ValueError, IndexError):
                print("Invalid number!")
        elif choice == '4':
            print("Goodbye!")
            sys.exit()
        else:
            print("Invalid choice, try again.")

if __name__ == "__main__":
    main()
