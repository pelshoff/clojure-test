(ns sorting
  (:use clojure.test)
  (:use sorting.bubblesort))

(deftest bubblesort-test
  (testing "bubblesort"
    (is (= [] (bubble-sort [])))
    (is (= [1] (bubble-sort [1])))
    (is (= [1 2 3] (bubble-sort [1 2 3])))
    (is (= [1 2 3 4 5 6 7 8 9] (bubble-sort [9 5 6 7 3 8 4 1 2])))
  )
)