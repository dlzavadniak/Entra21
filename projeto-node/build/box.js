"use strict";
var _a, _b, _c, _d;
let box = {
    contents: [],
    contentLenght: () => { var _a, _b; return (_b = (_a = box.contents) === null || _a === void 0 ? void 0 : _a.length) !== null && _b !== void 0 ? _b : 0; }
};
(_a = box.contents) === null || _a === void 0 ? void 0 : _a.push("conteudo");
let box2 = {
    contents: []
};
(_b = box2.contents) === null || _b === void 0 ? void 0 : _b.push(12);
let box3 = {
    contents: []
};
(_c = box3.contents) === null || _c === void 0 ? void 0 : _c.push("teste");
(_d = box3.contents) === null || _d === void 0 ? void 0 : _d.push(123);
function tes(arg) {
    return arg;
}
let n = tes("123");
