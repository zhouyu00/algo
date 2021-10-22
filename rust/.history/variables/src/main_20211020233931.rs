fn main() {

    //普普通通
    // let a1 = 5;

    // let b1:u32 =5;
    // assert_eq!(a1,b1);

    //可变绑定
    // let mut a: f64 = 1.0;
    // let b = 2.0f32;

    // //改变 a 的绑定
    // a = 2.0;
    // println!("{:?}", a);

    // //重新绑定为不可变
    // let a = a;

    // //不能赋值
    // a = 3.0;

    // //类型不匹配
    // // assert_eq!(a, b);

    //let解构
    let (a,mut b):(bool,bool)=(true,false);
    println!("a={:?},b={:?}",a,b);
    //不可变绑定
    // a = false;

    b = true;
    assert_eq!(a,b);

    //primitive type

    //bool type
    let t = true;
    let f:bool = false;
    //char type
    let c ='c';
    //numeric types
    let x = 42;
    let y:u32 =123_456;
    let z:f



}
