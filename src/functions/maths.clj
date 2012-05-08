(ns functions.maths)

(defn pow [x, y]
  (if (= y 0) 1
    (if (> y 0) (* x (pow x (- y 1)))
      (/ x (pow x (+ y 1))))))

(defn factorial [n]
  (apply * (range 1 (inc n))))

(defn fibonacci [n]
  (if (< n 1) 0
    (if (< n 3) 1
      (+ (fibonacci (- n 1)) (fibonacci (- n 2))))))

