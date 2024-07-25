CXX = g++
CXXFLAGS = -Wall -I./src
SRC_DIR = src
TEST_DIR = tests
BUILD_DIR = build
SRC_FILES = $(SRC_DIR)/quicksort.cpp $(SRC_DIR)/main.cpp $(SRC_DIR)/utils.cpp
TEST_FILES = $(TEST_DIR)/test_quicksort.cpp $(SRC_DIR)/quicksort.cpp $(SRC_DIR)/utils.cpp
SRC_OBJ_FILES = $(patsubst $(SRC_DIR)/%.cpp,$(BUILD_DIR)/%.o,$(SRC_FILES))
TEST_OBJ_FILES = $(patsubst $(TEST_DIR)/%.cpp,$(BUILD_DIR)/%.o,$(TEST_FILES))
EXEC = quicksort
TEST_EXEC = test_quicksort

all: $(EXEC) $(TEST_EXEC)

$(BUILD_DIR)/%.o: $(SRC_DIR)/%.cpp
	@mkdir -p $(BUILD_DIR)
	$(CXX) $(CXXFLAGS) -c $< -o $@

$(BUILD_DIR)/%.o: $(TEST_DIR)/%.cpp
	@mkdir -p $(BUILD_DIR)
	$(CXX) $(CXXFLAGS) -c $< -o $@

$(EXEC): $(SRC_OBJ_FILES)
	$(CXX) $(CXXFLAGS) $(SRC_OBJ_FILES) -o $(EXEC)

$(TEST_EXEC): $(TEST_OBJ_FILES)
	$(CXX) $(CXXFLAGS) $(TEST_OBJ_FILES) -o $(TEST_EXEC)

clean:
	rm -rf $(BUILD_DIR) $(EXEC) $(TEST_EXEC)

run: $(EXEC)
	./$(EXEC)

test: $(TEST_EXEC)
	./$(TEST_EXEC)

.PHONY: all clean run test
