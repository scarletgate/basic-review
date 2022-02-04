# ピタゴラスな三角形
# 三辺の長さが3，4，5である三角形は直角三角形です。これは「ピタゴラスの定理」から示されます。

# 【ピタゴラスの定理】 直角三角形について、直角をはさむ2辺の長さがaとbで斜辺の長さがcであるとき a2 + b2 = c2 が成り立つ。
# つまり、32 + 42 = 52（ = 25）が成立するので直角三角形といえるのです。

# 三辺の長さが整数で面積が8192以下である直角三角形は何種類あるかを求めてください。

# ※合同なもの（例えば“3，4，5”と“5，4，3”）は区別せず1種類として数えます。

a = 0
b = 0
c = 0

a*b/2 <= 8192
a*b <= 16384
num = 3**2 + 4**2 == 5**2
puts num
