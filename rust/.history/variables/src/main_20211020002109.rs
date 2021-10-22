fn main() {

    //普普通通
    // let a1 = 5;

    // let b1:u32 =5;
    // assert_eq!(a1,b1);

    //可变绑定
    let mut a: f64 = 1.0;
    let b = 2.0f32;

    //改变 a 的绑定
    a = 2.0;
    println!("{:?}", a);

    //重新绑定为不可变
    let a = a;

    //不能赋值
    a = 3.0;

    //类型不匹配
    //assert_eq!(a, b);

}
