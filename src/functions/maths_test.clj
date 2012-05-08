(ns functions
  (:use clojure.test)
  (:use functions.maths))

(deftest maths-test
  (testing "pow"
    (is (= 1 (pow 5 0)))
    (is (= 5 (pow 5 1)))
    (is (= 125 (pow 5 3)))
  )

  (testing "factorial"
    (is (= 1 (factorial 0)))
    (is (= 1 (factorial 1)))
    (is (= 120 (factorial 5)))
  )

  (testing "fibonacci"
    (is (= 0 (fibonacci 0)))
    (is (= 1 (fibonacci 2)))
    (is (= 5 (fibonacci 5)))
  )
)