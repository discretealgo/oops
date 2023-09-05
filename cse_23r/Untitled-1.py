
import pandas as pd
from sklearn.tree import DecisionTreeClassifier
from sklearn.metrics import accuracy_score, precision_score, recall_score, f1_score

# Load the diabetes dataset
data = pd.read_csv("diabetes.csv")

# Split the data into features and labels
X = data.drop("Outcome", axis=1)
y = data["Outcome"]

# Create a decision tree classifier
clf = DecisionTreeClassifier()

# Train the classifier
clf.fit(X, y)

# Make predictions
y_pred = clf.predict(X)

# Calculate the accuracy, precision, recall, and f1 score
accuracy = accuracy_score(y, y_pred)
precision = precision_score(y, y_pred)
recall = recall_score(y, y_pred)
f1 = f1_score(y, y_pred)

# Print the results
print("Accuracy:", accuracy)
print("Precision:", precision)
print("Recall:", recall)
print("F1 score:", f1)

# Visualize the tree
import graphviz
from sklearn.tree import export_graphviz

# Create a dot file for the decision tree
dot_file = export_graphviz(clf, out_file="diabetes_tree.dot", feature_names=X.columns, filled=True, rounded=True)

# Visualize the decision tree using Graphviz
graphviz.Source(dot_file).render("diabetes_tree")