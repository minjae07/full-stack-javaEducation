const express = require('express');
const res = require('express/lib/response');
const app = express();
const bodyParser = require('body-parser');
const MongoClient = require('mongodb').MongoClient;

// url 넘김
app.set('view engine','ejs')
app.use(bodyParser.urlencoded({extended:true}))

var db;
MongoClient.connect('mongodb+srv://admin:qwer1234@admin.1ai9x.mongodb.net/myFirstDatabase?retryWrites=true&w=majority',function(err,client){

    if (err) return console.log(err)
    db = client.db('app');
    app.listen(8000,function() {
        console.log('start server')
    })
})

app.get('/write',function(req,res){
    res.sendFile(__dirname + '/write.html')
})
app.post('/ok', function(req,res) {
    // counter에서 totalPost를 가지고 감
    db.collection("counter").findOne({name:'countername'},function(srr,result){
        var totalrecord = result.totalPost
    db.collection('memo').insertOne({_id : (totalrecord +1), title: req.body.title, wdate: req.body.wdate}, function (err, result) {
        db.collection("counter").updateOne({name : 'countername'},{ $inc: {totalPost:1}},function(err,result){

        console.log("입력완료");
            res.redirect('/list')

                 })
             })
         })
});

app.get('/list',function(req, res) {
    db.collection('memo').find().skip(1).sort({"amount":1,"_id":-1}).toArray(function (err,result){
        })

        res.render('list.ejs',{memos:result});



})

app.delete('/delete',function (req, res) {
    req.body._id = parseInt(req.body._id)
    db.collection('memo').deleteOne(req.body,function (err,result){
            console.log(req.body)
        res.send('삭제완료')
    })





})



app.get('/news',function(req,res) {
    res.sendFile(__dirname + '/news.html')
})

app.get('/shop',function(req,res) {
    res.sendFile(__dirname + '/shop.html')
})

app.get('/home',function(req,res) {
    res.sendFile(__dirname + '/home.html')
})

app.get('/write',function(req,res){
    res.sendFile(__dirname + '/write.html')
})























//#4월 30일

// const express = require('express');
// const res = require('express/lib/response');
// const app = express();
// const bodyParser = require('body-parser');
//
// const MongoClient = require('mongodb').MongoClient;
//
//
// // url 넘김
// app.use(bodyParser.urlencoded({extended:true}))
//
// var db;
// MongoClient.connect('mongodb+srv://admin:qwer1234@admin.1ai9x.mongodb.net/myFirstDatabase?retryWrites=true&w=majority',function(err,client){
//     if (err) return console.log(err)
//     db = client.db('app');
//     db.collection('memo').insertOne({이름 : 'DCU', 나이 : 25, _id : 100},function(err,result){
//         console.log('저장완료');
//     })
//
//
// app.listen(8000,function() {
//     console.log('start server')
// })
// })
//
//
//
//
// // app.get('/shop',function(req,res){
// //     res.send('쇼핑몰에 오신 것을 환영합니다.')
//
// // })
//
// // app.get('/news',function(req,res){
// //     res.send('뉴스페이지입니다.')
// // })
//
// app.get('/',function(req,res) {
// res.sendFile(__dirname + '/index.html')
// })
//
// app.get('/news',function(req,res) {
//     res.sendFile(__dirname + '/news.html')
// })
//
// app.get('/shop',function(req,res) {
//     res.sendFile(__dirname + '/shop.html')
// })
//
// app.get('/home',function(req,res) {
//     res.sendFile(__dirname + '/home.html')
// })
//
// app.get('/write',function(req,res){
//     res.sendFile(__dirname + '/write.html')
// })
//
// app.post('/ok', function(req,res){
//     console.log(req.body)
//     // console.log(req.body.title);
//     // console.log(req.body.wdate)
//     res.send('전송완료')
// })
//
//
