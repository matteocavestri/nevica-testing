CC = gcc
CFLAGS = -Wall -I./src
SRC_DIR = src
TEST_DIR = tests
BUILD_DIR = build
SRC_FILES = $(SRC_DIR)/quicksort.c $(SRC_DIR)/main.c $(SRC_DIR)/utils.c
TEST_FILES = $(TEST_DIR)/test_quicksort.c $(SRC_DIR)/quicksort.c $(SRC_DIR)/utils.c
SRC_OBJ_FILES = $(patsubst $(SRC_DIR)/%.c,$(BUILD_DIR)/%.o,$(SRC_FILES))
TEST_OBJ_FILES = $(patsubst $(TEST_DIR)/%.c,$(BUILD_DIR)/%.o,$(TEST_FILES))
EXEC = quicksort
TEST_EXEC = test_quicksort

all: $(EXEC) $(TEST_EXEC)

$(BUILD_DIR)/%.o: $(SRC_DIR)/%.c
	@mkdir -p $(BUILD_DIR)
	$(CC) $(CFLAGS) -c $< -o $@

$(BUILD_DIR)/%.o: $(TEST_DIR)/%.c
	@mkdir -p $(BUILD_DIR)
	$(CC) $(CFLAGS) -c $< -o $@

$(EXEC): $(SRC_OBJ_FILES)
	$(CC) $(CFLAGS) $(SRC_OBJ_FILES) -o $(EXEC)

$(TEST_EXEC): $(TEST_OBJ_FILES)
	$(CC) $(CFLAGS) $(TEST_OBJ_FILES) -o $(TEST_EXEC)

clean:
	rm -rf $(BUILD_DIR) $(EXEC) $(TEST_EXEC)

run: $(EXEC)
	./$(EXEC)

test: $(TEST_EXEC)
	./$(TEST_EXEC)

.PHONY: all clean run test
