fn main() {
    //包含各种不同类型的元祖
    let long_tuple =(1u8,2u16,3u32,4u64,
                    -1i8,-2i16,-3i32,-4i64,
                    0.1f32,0.2f64,
                'a',true);
    
    //通过下标来访问具体的值
    println!("long tuple first value :{}",long_tuple.0);
    println!("long tuple first value :{}",long_tuple.1);

    //元祖也可以充当元祖的元素
    let tuple_of_tuples = ((1u8,2u16,))
}

