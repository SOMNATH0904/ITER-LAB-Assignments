#include <stdio.h>
#include <stdlib.h>

typedef struct node {
    int data;
    struct node* next;
} node;

node* create_node(int value) {
    node* new_node = (node*)malloc(sizeof(node));
    new_node->data = value;
    new_node->next = NULL;
    return new_node;
}

void append_node(node** head, int value) {
    node* new_node = create_node(value);
    if (*head == NULL) {
        *head = new_node;
        return;
    }
    node* temp = *head;
    while (temp->next != NULL) {
        temp = temp->next;
    }
    temp->next = new_node;
}

void sort_linked_list(node* head) {
    for (node* i = head; i != NULL; i = i->next) {
        for (node* j = i->next; j != NULL; j = j->next) {
            if (i->data > j->data) {
                int temp = i->data;
                i->data = j->data;
                j->data = temp;
            }
        }
    }
}

void display_list(node* head) {
    node* temp = head;
    while (temp != NULL) {
        printf("%d ", temp->data);
        temp = temp->next;
    }
    printf("\n");
}

int main() {
    int n, value;
    node* head = NULL;
    printf("Enter the number of nodes: ");
    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        printf("Enter value for node %d: ", i + 1);
        scanf("%d", &value);
        append_node(&head, value);
    }
    printf("Original list: ");
    display_list(head);
    sort_linked_list(head);
    printf("Sorted list: ");
    display_list(head);
    return 0;
}
