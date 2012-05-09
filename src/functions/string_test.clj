(ns functions
  (:use clojure.test)
  (:use functions.string))

(deftest string-test
  (testing "reverseWords"
    (is (= "test a is this" (reverseWords "this is a test")))
    (is (= "foobar" (reverseWords "foobar")))
    (is (= "base your all" (reverseWords "all your base")))
  )
)
